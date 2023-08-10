package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public interface UnitVisitor {

    void visitor(Sergeant sergeant);

    void visitor(Commander commander);

    void visitor(Soldier soldier);
}
