package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class Commander extends Unit{

    Commander(Unit... children){
        super(children);
    }
    @Override
    public void accept(UnitVisitor visitor) {
        visitor.commander(this);
        super.accept(visitor);
    }
}
