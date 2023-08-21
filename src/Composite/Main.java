package Composite;

import java.util.Arrays;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/21/2023
 */
public class Main {

    public static void main(String[] args) {
        Component sentenceOrcs = messageFromOrcs();
        Component sentenceElves = messageFromElves();
        sentenceOrcs.execute();
        sentenceElves.execute();
    }

    static Component messageFromOrcs() {

        Word[] words = new Word[]{new Word('W', 'h', 'e', 'r', 'e'),
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'h', 'i', 'p'),
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'a', 'y')};


        return new Sentence(Arrays.asList(words));

    }

    static Component messageFromElves() {

        Word[] words = new Word[]{
                new Word('M', 'u', 'c', 'h'),
                new Word('w', 'i', 'n', 'd'),
                new Word('p', 'o', 'u', 'r', 's'),
                new Word('f', 'r', 'o', 'm'),
                new Word('y', 'o', 'u', 'r'),
                new Word('m', 'o', 'u', 't', 'h')};


        return new Sentence(Arrays.asList(words));

    }
}
