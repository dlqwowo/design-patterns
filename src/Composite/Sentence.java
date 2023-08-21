package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/21/2023
 */
public class Sentence extends Composite {

    Sentence(List<Word> words) {
        words.forEach(word -> add(word));
    }


    @Override
    public void after() {
        System.out.println(".");
    }
}
