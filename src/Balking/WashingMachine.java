package Balking;

import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */
public class WashingMachine {

    private final DelayProvider delayProvider;

    private WashingMachineState washingMachineState;

    /**
     * Creates a new instance of WashingMachine using provided delayProvider. This constructor is used
     * only for unit testing purposes.
     */
    public WashingMachine(DelayProvider delayProvider) {
        this.delayProvider = delayProvider;
        this.washingMachineState = WashingMachineState.ENABLED;
    }

    /**
     * Creates a new instance of WashingMachine.
     */
    public WashingMachine() {
        this((interval, timeUnit, task) -> {
            try {
                Thread.sleep(timeUnit.toMillis(interval));
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
                Thread.currentThread().interrupt();
            }
            task.run();
        });
    }


    public void wash() {
        synchronized (this) {
            var machineState = getWashingMachineState();
            System.out.println(String.format("{}: Actual machine state: {}", Thread.currentThread().getName(), machineState));
            if (this.washingMachineState == WashingMachineState.WASHING) {
                System.out.println("Cannot wash if the machine has been already washing!");
                return;
            }
            this.washingMachineState = WashingMachineState.WASHING;
        }
        System.out.println(String.format("{}: Doing the washing", Thread.currentThread().getName()));

        this.delayProvider.executeAfterDelay(50, TimeUnit.MILLISECONDS, this::endOfWashing);
    }

    public WashingMachineState getWashingMachineState() {
        return washingMachineState;
    }

    /**
     * Method responsible of ending the washing by changing machine state.
     */
    public synchronized void endOfWashing() {
        washingMachineState = WashingMachineState.ENABLED;
        System.out.println(String.format("{}: Washing completed.", Thread.currentThread().getId()));
    }


}
