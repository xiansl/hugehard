package trading.marketdata.BetfairStreamAPI.protocol;

import java.io.IOException;

public interface RequestSender {
    void sendLine(String line) throws Exception;
}
