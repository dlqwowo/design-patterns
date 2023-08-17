package AsyncMethodInvocation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/16/2023
 */
public interface AsyncExecutor {

    <T> AsyncResult<T> startProcess(Callable<T> task);

    <T> AsyncResult startProcess(Callable<T> task, AsyncCallback<T> asyncCallable);

    /**
     * Ends processing of an async task. Blocks the current thread if necessary and returns the
     * evaluated value of the completed task.
     *
     * @param asyncResult
     * @param <T>
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    <T> T endprocess(AsyncResult<T> asyncResult) throws ExecutionException, InterruptedException;
}
