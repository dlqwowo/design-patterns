package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class SoldiderVisitor implements UnitVisitor{
    @Override
    public void visitor(Sergeant sergeant) {

    }

    @Override
    public void visitor(Commander commander) {

    }

    @Override
    public void visitor(Soldier soldier) {
        System.out.println("Welcome soldier.");
    }
}
