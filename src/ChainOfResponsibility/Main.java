package ChainOfResponsibility;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */
public class Main {

    public static void main(String[] args) {
        OrcKing king = new OrcKing();
        king.markRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
    }
}
