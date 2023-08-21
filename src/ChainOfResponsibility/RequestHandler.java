package ChainOfResponsibility;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */
public interface RequestHandler {

    boolean canHandleRequest(Request request);

    void handle(Request request);

    int getPriority();

    String name();
}
