package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class Sergeant extends Unit{

    Sergeant(Unit... children){
        this.children = children;
    }
    @Override
    public void accept(UnitVisitor visitor) {
        visitor.sergeant(this);
        super.accept(visitor);
    }
}
