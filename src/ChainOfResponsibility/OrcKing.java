package ChainOfResponsibility;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */
public class OrcKing {

    private List<RequestHandler> handlers;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        handlers = Arrays.asList(new OrcCommander());
    }

    public void markRequest(Request request) {
        handlers.stream()
                .sorted(Comparator.comparing(RequestHandler::getPriority))
                .filter(requestHandler -> request.isHandled())
                .findFirst()
                .ifPresent(requestHandler -> requestHandler.handle(request));
    }
}
