package ChainOfResponsibility;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */
public class Request {

    private final RequestType requestType;

    private final String requestDescription;

    private boolean handled;

    Request(final RequestType requestType, final String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return this.requestType;
    }

    public String getRequestDescription() {
        return this.requestDescription;
    }

    public void markHandled() {
        this.handled = true;
    }

    public boolean isHandled() {
        return this.handled;
    }

    @Override
    public String toString() {
        return this.requestDescription;
    }

}

