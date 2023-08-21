package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/21/2023
 */
public abstract class Composite implements Component {

    private List<Component> children = new ArrayList<Component>();

    void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void execute() {
        before();
        this.children.forEach(children -> children.execute());
        after();
    }

    public void before() {

    }

    public void after() {

    }
}
