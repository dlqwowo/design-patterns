package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class CommanderVisitor implements UnitVisitor{
    @Override
    public void visitor(Sergeant sergeant) {

    }

    @Override
    public void visitor(Commander commander) {
        System.out.println("Welcome commander");
    }

    @Override
    public void visitor(Soldier soldier) {

    }
}
