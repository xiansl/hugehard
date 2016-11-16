package trading.marketdata.BetfairStreamAPI.protocol;

import java.util.EventListener;

public interface ConnectionStatusListener extends EventListener {
	void connectionStatusChange(ConnectionStatusChangeEvent statusChangeEvent);
}
