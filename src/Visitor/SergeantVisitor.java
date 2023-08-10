package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class SergeantVisitor implements UnitVisitor{
    @Override
    public void visitor(Sergeant sergeant) {
        System.out.println("Welcome sergeant");
    }

    @Override
    public void visitor(Commander commander) {
        // doNothing
    }

    @Override
    public void visitor(Soldier soldier) {
        // doNothing
    }
}
