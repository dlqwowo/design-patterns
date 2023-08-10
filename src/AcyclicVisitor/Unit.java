package AcyclicVisitor;


import java.util.Arrays;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public abstract class Unit {

    public Unit[] children;

    Unit(Unit... children){
        this.children = children;
    }

    public void accept(UnitVisitor visitor){
        Arrays.asList(children).stream().forEach(child -> child.accept(visitor));
    }
}
