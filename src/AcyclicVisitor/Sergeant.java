package AcyclicVisitor;


/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class Sergeant extends Unit {

    Sergeant(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        if (visitor instanceof SergeantVisitor) {
            ((SergeantVisitor) visitor).visit(this);
        } else {
            System.out.println("Only SergeantVisitor is allowed to Sergeant");
        }
        super.accept(visitor);
    }
}
