package Balking;

import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */
public interface DelayProvider {

    /**
     * An interface to simulate delay while executing some work
     *
     * @param interval
     * @param timeUnit
     * @param task
     */
    void executeAfterDelay(long interval, TimeUnit timeUnit, Runnable task);
}
