package trading.marketdata.BetfairStreamAPI.protocol;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import trading.marketdata.BetfairStreamAPI.swagger.model.*;


/**
 * Generic subscription handler for change messages:
 * 1) Tracks clocks to facilitate resubscripiton
 * 2) Provides useful timings for initial image
 * 3) Supports the ability to re-combine segmented messages to retain event level atomicity
 */
public class SubscriptionHandler<S extends RequestMessage,C extends ChangeMessage<I>,I> {
    private final int subscriptionId;
    private final S subscriptionMessage;
    private boolean isSubscribed;
    private boolean isMergeSegments;
    private List<I> mergedChanges;
    private int itemCount;
    private CountDownLatch subscriptionComplete = new CountDownLatch(1);
    
    private long lastPublishTime;
    private long lastArrivalTime;
    private String initialClk;
    private String clk;
    private Long heartbeatMs;
    private Long conflationMs;
    
    public SubscriptionHandler(S subscriptionMessage, boolean isMergeSegments)
    {
        this.subscriptionMessage = subscriptionMessage;
        this.isMergeSegments = isMergeSegments;
        isSubscribed = false;
        subscriptionId = subscriptionMessage.getId();
    }

    public S getSubscriptionMessage() {
        return subscriptionMessage;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public long getLastPublishTime() {
        return lastPublishTime;
    }

    public long getLastArrivalTime() {
        return lastArrivalTime;
    }

    public Long getHeartbeatMs() {
        return heartbeatMs;
    }

    public Long getConflationMs() {
        return conflationMs;
    }

    public String getInitialClk() {
        return initialClk;
    }

    public String getClk() {
        return clk;
    }

    void cancel()
    {
        //unwind waiters
        subscriptionComplete.countDown();
    }

    public C processChangeMessage(C changeMessage)
    {
        if(subscriptionId != changeMessage.getId())
        {
            //previous subscription id - ignore
            return null;
        }

        //Every message store timings
        lastPublishTime = changeMessage.getPublishTime();
        lastArrivalTime = changeMessage.getArrivalTime();

        if (changeMessage.isStartOfRecovery())
        {
            //Start of recovery
            ttfm.stop();
            LOG.info("{}: Start of image", subscriptionMessage.getOp());
        }

        if (changeMessage.getChangeType() == ChangeType.HEARTBEAT)
        {
            //Swallow heartbeats
            changeMessage = null;
        }
        else if(changeMessage.getSegmentType() != SegmentType.NONE && isMergeSegments)
        {
            //Segmented message and we're instructed to merge (which makes segments look atomic).
            changeMessage = MergeMessage(changeMessage);
        }

        if(changeMessage != null)
        {
            //store clocks
            if(changeMessage.getInitialClk() != null)
            {
                initialClk = changeMessage.getInitialClk();
            }
            if(changeMessage.getClk() != null)
            {
                clk = changeMessage.getClk();
            }

            if (!isSubscribed)
            {
                //During recovery
                if (changeMessage.getItems() != null)
                {
                    itemCount += changeMessage.getItems().size();
                }
            }

            if (changeMessage.isEndOfRecovery())
            {
                //End of recovery
                isSubscribed = true;
                heartbeatMs = changeMessage.getHeartbeatMs();
                conflationMs = changeMessage.getConflateMs();

                System.out.println("{"+subscriptionMessage.getOp()+"}: End of image: type:{"
                			+changeMessage.getChangeType()+"}, conflation:{"
                			+conflationMs+"}, heartbeat:{"
                			+heartbeatMs+"}, change.items:{"
                			+itemCount+"}");

                //unwind future
                subscriptionComplete.countDown();
            }

        }
        return changeMessage;
    }

    private C MergeMessage(C changeMessage)
    {
        //merge segmented messages so client sees atomic view across segments
        if (changeMessage.getSegmentType() == SegmentType.SEG_START)
        {
            //start merging
            mergedChanges = new ArrayList<>();
        }
        //accumulate
        mergedChanges.addAll(changeMessage.getItems());

        if (changeMessage.getSegmentType() == SegmentType.SEG_END)
        {
            //finish merging
            changeMessage.setSegmentType(SegmentType.NONE);
            changeMessage.setItems(mergedChanges);
            mergedChanges = null;
        }
        else
        {
            //swallow message as we're still merging
            changeMessage = null;
        }
        return changeMessage;
    }

}
