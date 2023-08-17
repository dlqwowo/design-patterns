package AsyncMethodInvocation;

import java.util.Optional;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/16/2023
 */
public interface AsyncCallback<T> {

    /**
     * Complete handler which is executed when async task is completed ro fails execution
     *
     * @param value
     * @param ex
     */
    void onComplete(T value, Optional<Exception> ex);
}
