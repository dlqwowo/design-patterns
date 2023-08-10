package AcyclicVisitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class KnowSergeantVisitor implements SergeantVisitor{
    @Override
    public void visit(Sergeant sergeant) {
        System.out.println("Welcome Sergeant");
    }
}
