package trading.app;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import trading.marketdata.BetfairStreamAPI.BetfairMarket;

public class BetfairStreamApp extends BaseApp {
	private BetfairMarket betfairMarket;
	
	public BetfairStreamApp() {
		betfairMarket = new BetfairMarket(
								"BetfairMarket", 
								"stream-api-integration.betfair.com",
								443,
								getValidSessionProvider()
							);
	}
	
	public void testInvalidHost() throws Exception {
		BetfairMarket invalidClient = new BetfairMarket("BetfairMarket", "www.betfair.com", 443, getValidSessionProvider());
	}
	
	public void test() {
		try {
			testInvalidHost();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
