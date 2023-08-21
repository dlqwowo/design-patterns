package ChainOfResponsibility;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */
public class OrcCommander implements RequestHandler{
    @Override
    public boolean canHandleRequest(Request request) {
        return request.getRequestType() == RequestType.DEFEND_CASTLE;
    }

    @Override
    public void handle(Request request) {
        request.markHandled();
        System.out.println("Handle request " + name() + " " + request);
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public String name() {
        return "Orc commander";
    }
}
