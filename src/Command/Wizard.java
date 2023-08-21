package Command;

import lombok.extern.slf4j.Slf4j;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/21/2023
 */
public class Wizard {

    /**
     * 取消操作
     */
    private final Deque<Runnable> undoStack = new LinkedList<>();

    /**
     * 重试操作
     */
    private final Deque<Runnable> redoStack = new LinkedList<>();

    public void castSpell(Runnable runnable) {
        undoStack.offerLast(runnable);
        runnable.run();
    }

    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            Runnable previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            previousSpell.run();
        }
    }

    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            Runnable previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            previousSpell.run();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
