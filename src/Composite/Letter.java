package Composite;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/21/2023
 */

/**
 * Leaf Node, 不包含子节点的终端节点
 */
public class Letter implements Component {

    private Character c;

    Letter(Character c) {
        this.c = c;
    }

    @Override
    public void execute() {
        System.out.print(c);
    }


}
