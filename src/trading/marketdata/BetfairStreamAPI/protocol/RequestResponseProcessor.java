package trading.marketdata.BetfairStreamAPI.protocol;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import trading.marketdata.BetfairStreamAPI.swagger.model.*;

public class RequestResponseProcessor {
    public static final String REQUEST_AUTHENTICATION = "authentication";
    public static final String REQUEST_MARKET_SUBSCRIPTION = "marketSubscription";
    public static final String REQUEST_ORDER_SUBSCRIPTION = "orderSubscription";
    public static final String REQUEST_HEARTBEAT = "heartbeat";

    public static final String RESPONSE_CONNECTION = "connection";
    public static final String RESPONSE_STATUS = "status";
    public static final String RESPONSE_MARKET_CHANGE_MESSAGE = "mcm";
    public static final String RESPONSE_ORDER_CHANGE_MESSAGE = "ocm";
    
    private AtomicInteger nextId = new AtomicInteger();
    private FutureResponse<ConnectionMessage> connectionMessage = new FutureResponse<>();
    private ConcurrentHashMap<Integer, RequestResponse> tasks = new ConcurrentHashMap<>();
    
    //subscription handlers
    private SubscriptionHandler<MarketSubscriptionMessage, ChangeMessage<MarketChange>, MarketChange> marketSubscriptionHandler;
    private SubscriptionHandler<OrderSubscriptionMessage, ChangeMessage<OrderMarketChange>, OrderMarketChange> orderSubscriptionHandler;

    private ChangeMessageHandler changeHandler;
    private RequestSender sendLine;
    private ConnectionStatus status = ConnectionStatus.STOPPED;
    private CopyOnWriteArrayList<ConnectionStatusListener> connectionStatusListeners = new CopyOnWriteArrayList<>();
    
    private long lastRequestTime = Long.MAX_VALUE;
    private long lastResponseTime = Long.MAX_VALUE;

    private int traceChangeTruncation;
    private Object sendLock = new Object();
    
    public RequestResponseProcessor(RequestSender sendLine) {
        this.sendLine = sendLine;
        setChangeHandler(null);
    }
	
}
