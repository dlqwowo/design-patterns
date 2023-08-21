package Composite;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/21/2023
 */

import java.util.Arrays;

/**
 * Composite 节点， 包含多个子节点对象的复合型节点
 */
public class Word extends Composite {

    Word(Character... chars) {
        Arrays.stream(chars).forEach(character -> add(new Letter(character)));
    }

    @Override
    public void before() {
        System.out.print(" ");
    }

}
