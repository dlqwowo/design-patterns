package Callback;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */
public class main {

    public static void main(String[] args) {
        SimpleTask executeCallback = new SimpleTask();
        executeCallback.executeWith(() -> System.out.println("Execute callback"));

    }
}
