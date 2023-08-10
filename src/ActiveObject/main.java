package ActiveObject;

import java.util.Arrays;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/9/2023
 */
public class main {

    public static void main(String[] args) {
        ActiveCreature creature;
        try {
            for (int i = 0;i < 3;i++) {
                creature = new Orc(Orc.class.getSimpleName().toString() + i);
                creature.eat();
                creature.roam();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        // Runtime.getRuntime().exit(1);
    }
}
