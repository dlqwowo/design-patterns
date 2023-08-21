package Bytecode;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */

import lombok.Getter;

import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Implementation of virtual machine.
 */
@Getter
public class VirtualMachine {

    private final Stack<Integer> stack = new Stack<>();

    private final Wizard[] wizards = new Wizard[2];

    /**
     * No-args constructor.
     */
    public VirtualMachine() {
        wizards[0] = new Wizard(randomInt(3, 32), randomInt(3, 32), randomInt(3, 32),
                0, 0);
        wizards[1] = new Wizard(randomInt(3, 32), randomInt(3, 32), randomInt(3, 32),
                0, 0);
    }

    /**
     * Constructor taking the wizards as arguments.
     */
    public VirtualMachine(Wizard wizard1, Wizard wizard2) {
        wizards[0] = wizard1;
        wizards[1] = wizard2;
    }

    /**
     * Executes provided bytecode.
     *
     * @param bytecode to execute
     */
    public void execute(int[] bytecode) {
        for (int i = 0; i < bytecode.length; i++) {
            Instruction instruction = Instruction.getInstruction(bytecode[i]);
            switch (instruction) {
                case LITERAL:
                    // Read the next byte from the bytecode.
                    int value = bytecode[++i];
                    // Push the next value to stack
                    stack.push(value);
                    break;
                case SET_AGILITY:
                    int amount = stack.pop();
                    int wizard = stack.pop();
                    setAgility(wizard, amount);
                    break;
                case SET_WISDOM:
                    amount = stack.pop();
                    wizard = stack.pop();
                    setWisdom(wizard, amount);
                    break;
                case SET_HEALTH:
                    amount = stack.pop();
                    wizard = stack.pop();
                    setHealth(wizard, amount);
                    break;
                case GET_HEALTH:
                    wizard = stack.pop();
                    stack.push(getHealth(wizard));
                    break;
                case GET_AGILITY:
                    wizard = stack.pop();
                    stack.push(getAgility(wizard));
                    break;
                case GET_WISDOM:
                    wizard = stack.pop();
                    stack.push(getWisdom(wizard));
                    break;
                case ADD:
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                    break;
                case DIVIDE:
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b / a);
                    break;
                case PLAY_SOUND:
                    wizard = stack.pop();
                    getWizards()[wizard].playSound();
                    break;
                case SPAWN_PARTICLES:
                    wizard = stack.pop();
                    getWizards()[wizard].spawnParticles();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid instruction value");
            }
            System.out.println("Executed " + instruction.name() + ", Stack contains " + getStack());
        }
    }

    public void setHealth(int wizard, int amount) {
        wizards[wizard].setHealth(amount);
    }

    public void setWisdom(int wizard, int amount) {
        wizards[wizard].setWisdom(amount);
    }

    public void setAgility(int wizard, int amount) {
        wizards[wizard].setAgility(amount);
    }

    public int getHealth(int wizard) {
        return wizards[wizard].getHealth();
    }

    public int getWisdom(int wizard) {
        return wizards[wizard].getWisdom();
    }

    public int getAgility(int wizard) {
        return wizards[wizard].getAgility();
    }

    private int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
