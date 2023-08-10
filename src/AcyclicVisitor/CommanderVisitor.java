package AcyclicVisitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public interface CommanderVisitor extends UnitVisitor{

   void visit(Commander commander);
}
