package trading.marketdata.BetfairStreamAPI.protocol;

import java.util.concurrent.FutureTask;

public class FutureResponse<T> extends FutureTask<T> {
    private static final Runnable NULL = new Runnable() {
        @Override
        public void run() {
        }
    };

    public FutureResponse() {
        super(NULL, null);
    }

    public void setResponse(T response) {
        set(response);
    }

    public void setException(Throwable t) { super.setException(t);}
}
