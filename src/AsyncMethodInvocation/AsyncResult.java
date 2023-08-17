package AsyncMethodInvocation;

import java.util.concurrent.ExecutionException;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/16/2023
 */
public interface AsyncResult<T> {

    boolean isCompleted();

    T getValue() throws ExecutionException;

    /**
     * Blocks the current task until the async task is completed
     *
     * @throws InterruptedException
     */
    void await() throws InterruptedException;
}
