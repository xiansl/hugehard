package trading.marketdata.BetfairStreamAPI.protocol;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

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
    
    private long lastRequestTime = Long.MAX_VALUE;
    private long lastResponseTime = Long.MAX_VALUE;

    private int traceChangeTruncation;
    private Object sendLock = new Object();
    
    public RequestResponseProcessor() {
    	
    }
	
}
