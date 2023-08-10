package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class SergeantVisitor implements UnitVisitor{
    @Override
    public void sergeant(Sergeant sergeant) {
        System.out.println("Welcome sergeant");
    }

    @Override
    public void commander(Commander commander) {
        // doNothing
    }

    @Override
    public void soldier(Soldier soldier) {
        // doNothing
    }
}
