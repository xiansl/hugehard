package trading.marketdata.BetfairStreamAPI.protocol;

import trading.marketdata.BetfairStreamAPI.swagger.model.*;

// This interface abstracts connection & cache implementation.
public interface ChangeMessageHandler {
    void onOrderChange(ChangeMessage<OrderMarketChange> change);
    void onMarketChange(ChangeMessage<MarketChange> change);
    void onErrorStatusNotification(StatusMessage message);
}
