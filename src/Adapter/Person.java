package Adapter;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class Person {

    private OldFunction oldFunction;

    Person(OldFunction oldFunction){
        this.oldFunction = oldFunction;
    }

    public void eat(){
        oldFunction.eat();
    }
}
