package AcyclicVisitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class AllKnowVisitor implements AllUnitVisitor {
    @Override
    public void visit(Commander commander) {
        System.out.println("Welcome Commander");
    }

    @Override
    public void visit(Sergeant sergeant) {
        System.out.println("Welcome Sergeant");
    }
}
