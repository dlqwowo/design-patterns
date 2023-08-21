package Command;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/21/2023
 */
public class Main {

    public static void main(String[] args) {
        // invoker
        Wizard wizard = new Wizard();
        // target
        Goblin goblin = new Goblin();

        goblin.printStatus();
        wizard.castSpell(goblin::changeSize);
        goblin.printStatus();
        wizard.castSpell(goblin::changeVisibility);
        goblin.printStatus();
        wizard.undoLastSpell();
        goblin.printStatus();
        wizard.undoLastSpell();
        goblin.printStatus();
        wizard.redoLastSpell();
        goblin.printStatus();
        wizard.redoLastSpell();
        goblin.printStatus();
    }
}
