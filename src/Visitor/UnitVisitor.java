package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public interface UnitVisitor {

    void sergeant(Sergeant sergeant);

    void commander(Commander commander);

    void soldier(Soldier soldier);
}
