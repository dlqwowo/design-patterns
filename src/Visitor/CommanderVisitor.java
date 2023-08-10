package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class CommanderVisitor implements UnitVisitor{
    @Override
    public void sergeant(Sergeant sergeant) {

    }

    @Override
    public void commander(Commander commander) {
        System.out.println("Welcome commander");
    }

    @Override
    public void soldier(Soldier soldier) {

    }
}
