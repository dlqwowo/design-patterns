package Adapter;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class PersonAdapter implements OldFunction {

    private NewFunction newFunction;

    PersonAdapter(NewFunction newFunction) {
        this.newFunction = newFunction;
    }

    @Override
    public void eat() {
        newFunction.eatPig();
    }
}
