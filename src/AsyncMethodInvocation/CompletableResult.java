package AsyncMethodInvocation;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

/**
 * Simple implementation of async result that allows completing it successfully with a value or
 * exceptionally with an exception. A really simplified version from its real life cousins
 * FutureTask and CompletableFuture.
 *
 * @Author PowerQun
 * @Date 8/16/2023
 */

public class CompletableResult<T> implements AsyncResult {

    static final int RUNNING = 1;
    static final int FAILED = 2;

    static final int COMPLETED = 3;

    int state = RUNNING;

    T value;

    Exception ex;

    final Object lock;

    final Optional<AsyncCallback<T>> callback;

    CompletableResult(AsyncCallback<T> callback) {
        this.lock = new Object();
        this.callback = Optional.ofNullable(callback);
    }

    /**
     * Set the value from successful execution and executes callback if available.
     *
     * @param value
     */
    void setValue(T value) {
        this.value = value;
        this.state = COMPLETED;
        this.callback.ifPresent(ck -> ck.onComplete(value, Optional.empty()));
        synchronized (this.lock) {
            this.lock.notifyAll();
        }
    }

    void setException(Exception ex) {
        this.ex = ex;
        this.state = FAILED;
        this.callback.ifPresent(ck -> ck.onComplete(null, Optional.empty()));
        synchronized (this.lock) {
            this.lock.notifyAll();
        }
    }


    @Override
    public boolean isCompleted() {
        return this.state > 2;
    }

    @Override
    public Object getValue() throws ExecutionException {
        if (this.state == COMPLETED) {
            return this;
        } else if (this.state == FAILED) {
            throw new ExecutionException(this.ex);
        } else {
            throw new IllegalStateException("Execution not completed yet");
        }
    }

    @Override
    public void await() throws InterruptedException {
        synchronized (this.lock) {
            while (!isCompleted()) {
                this.lock.wait();
            }
        }
    }
}
