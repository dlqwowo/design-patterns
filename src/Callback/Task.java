package Callback;

import java.util.Optional;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */
public abstract class Task {

    void executeWith(Callback callback) {
        execute();
        Optional.ofNullable(callback).ifPresent(Callback::callback);
    }

    public abstract void execute();
}

