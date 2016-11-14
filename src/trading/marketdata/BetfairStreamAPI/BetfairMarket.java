package trading.marketdata.BetfairStreamAPI;

import trading.marketdata.Market;
import trading.utils.betfair.auth.*;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;
import java.util.concurrent.*;

public class BetfairMarket extends Market {
	
	private static final String CRLF = "\r\n";

    private final String hostName;
    private final int port;
    private final AppKeyAndSessionProvider sessionProvider;
	
    private boolean autoReconnect = true;
    private long timeout = 30 * 1000;
    private long reconnectBackOff = 15 * 1000;
    private long keepAliveHeartbeat = 1 * 60 * 60 * 1000;
    
    //Threading control
    private Object startStopLock = new Object();
    private boolean isStarted;
    private boolean isStopping;
    private CountDownLatch isStopped;
    private int disconnectCounter;
    private int reconnectCounter;
    private long lastConnectTime;
    private ScheduledExecutorService keepAliveTimer;
    private Object retryLock = new Object();
    
    //IO
    private Socket client;
    private BufferedReader reader;
    private BufferedWriter writer;


    private Long conflateMs;
    private Long heartbeatMs;
    
	public BetfairMarket(String marketName, String refUrl, String hostName, int port, AppKeyAndSessionProvider sessionProvider) {
		super(marketName, refUrl);
		this.hostName = hostName;
		this.port = port;
		this.sessionProvider = sessionProvider;
	}
	

	
}
