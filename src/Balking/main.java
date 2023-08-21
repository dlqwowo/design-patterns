package Balking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */
public class main {

    public static void main(String[] args) {
        final WashingMachine washingMachine = new WashingMachine();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.execute(washingMachine::wash);
        }
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException ie) {
            System.out.println("ERROR: Waiting on executor service shutdown!");
            Thread.currentThread().interrupt();
        }
    }
}
