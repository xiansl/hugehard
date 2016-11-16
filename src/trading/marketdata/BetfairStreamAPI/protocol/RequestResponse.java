package trading.marketdata.BetfairStreamAPI.protocol;

import java.io.IOException;
import java.util.function.Consumer;

import trading.marketdata.BetfairStreamAPI.swagger.model.*;

public class RequestResponse {
    private final FutureResponse<StatusMessage> future = new FutureResponse<>();
    private final RequestMessage request;
    private final Consumer<RequestResponse> onSuccess;
    private final int id;
    
    public RequestResponse(int id, RequestMessage request, Consumer<RequestResponse> onSuccess){
        this.id = id;
        this.request = request;
        this.onSuccess = onSuccess;
    }

    public void processStatusMessage(StatusMessage statusMessage){
        if(statusMessage.getStatusCode() == StatusMessage.StatusCodeEnum.SUCCESS){
            if(onSuccess != null) onSuccess.accept(this);
            future.setResponse(statusMessage);
        }
    }
    
    public FutureResponse<StatusMessage> getFuture() {
        return future;
    }

    public RequestMessage getRequest() {
        return request;
    }

    public int getId() {
        return id;
    }

    public void setException(Exception e) {
        future.setException(e);
    }
}
