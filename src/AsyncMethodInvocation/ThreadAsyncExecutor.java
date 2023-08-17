package AsyncMethodInvocation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/16/2023
 */
public class ThreadAsyncExecutor implements AsyncExecutor {

    private final AtomicInteger idx = new AtomicInteger(0);

    @Override
    public <T> AsyncResult<T> startProcess(Callable<T> task) {
        return startProcess(task, null);
    }

    @Override
    public <T> AsyncResult startProcess(Callable<T> task, AsyncCallback<T> asyncCallback) {
        var result = new CompletableResult<>(asyncCallback);
        new Thread(() -> {
            try {
                result.setValue(task.call());
            } catch (Exception e) {
                result.setException(e);
            }
        }, "executor-" + this.idx.incrementAndGet()).start();
        return result;
    }

    @Override
    public <T> T endprocess(AsyncResult<T> asyncResult) throws ExecutionException, InterruptedException {
        if (!asyncResult.isCompleted()) {
            asyncResult.await();
        }
        return asyncResult.getValue();
    }

}


