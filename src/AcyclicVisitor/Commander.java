package AcyclicVisitor;



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
        if(visitor instanceof CommanderVisitor){
            ((AcyclicVisitor.CommanderVisitor)visitor).visit(this);
        }else{
            System.out.println("Only CommanderVisitor is allowed to Commander");
        }
        super.accept(visitor);
    }
}
