package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class SoldiderVisitor implements UnitVisitor{
    @Override
    public void sergeant(Sergeant sergeant) {

    }

    @Override
    public void commander(Commander commander) {

    }

    @Override
    public void soldier(Soldier soldier) {
        System.out.println("Welcome soldier.");
    }
}
