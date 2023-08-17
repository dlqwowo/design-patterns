package AsyncMethodInvocation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/16/2023
 */
public class main {

    static String ROCKET_LAUNCH_LOG_PATTERN = "Space rocket <%s> launched successfully";

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadAsyncExecutor executor = new ThreadAsyncExecutor();
        final var asyncResult1 = executor.startProcess(lazyval(10, 500));
        final var asyncResult2 = executor.startProcess(lazyval("test", 300));
        final var asyncResult3 = executor.startProcess(lazyval(50L, 700));
        final var asyncResult4 = executor.startProcess(lazyval(20, 400),callback("Deploying lunar rover"));
        final var asyncResult5 = executor.startProcess(lazyval("callback", 600),callback("Deploying lunar rover"));

        Thread.sleep(350);

        System.out.println("Mission command is sipping coffee");

        // Wait for completion of the task and get result
        final var result1 = executor.endprocess(asyncResult1);
        final var result2 = executor.endprocess(asyncResult2);
        final var result3 = executor.endprocess(asyncResult3);

        // Wait for completion of the task
        asyncResult4.await();
        asyncResult5.await();

        System.out.println(String.format(ROCKET_LAUNCH_LOG_PATTERN, result1));
        System.out.println(String.format(ROCKET_LAUNCH_LOG_PATTERN, result2));
        System.out.println(String.format(ROCKET_LAUNCH_LOG_PATTERN, result3));
    }

    public static <T> Callable<T> lazyval(T value, long delayMills) {
        return () -> {
            Thread.sleep(delayMills);
            System.out.println(String.format(ROCKET_LAUNCH_LOG_PATTERN, value));
            return value;
        };
    }

    public static <T> AsyncCallback<T> callback(String name) {
        return ((value, ex) -> {
            if (ex.isPresent()) {
                System.out.println(name + " failed:" + ex.map(Exception::getMessage).orElse(""));
            } else {
                System.out.println(name + " <" + value + ">");
            }
        });
    }
}
