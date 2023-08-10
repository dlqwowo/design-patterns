package ActiveObject;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/9/2023
 */
public abstract class ActiveCreature {

    private BlockingQueue<Runnable> blockingQueue;

    private Thread thread;

    private String name;

    ActiveCreature(String name) {
        this.name = name;
        this.blockingQueue = new LinkedBlockingQueue<>();
        this.thread = new Thread(() -> {
            while (true) {
                try {
                    // run() method not create new thread
                    this.blockingQueue.take().run();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        this.thread.start();
    }

    public void eat() throws InterruptedException {

        blockingQueue.put(() -> {
            System.out.println(name() + " eating!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name() + " finished eating!");
        });
    }

    public void roam() throws InterruptedException {
        blockingQueue.put(() ->
                {
                    System.out.println(name() + " has started to roam and the wastelands.");
                }
        );
    }

    public String name() {
        return name;
    }

}
