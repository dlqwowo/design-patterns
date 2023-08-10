package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class Soldier extends Unit {

    Soldier(Unit... children) {
        this.children = children;
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.soldier(this);
        super.accept(visitor);
    }
}
