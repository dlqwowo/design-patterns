package Visitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class main {

    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        Commander commander = new Commander(soldier);
        Sergeant sergeant = new Sergeant(commander);

        // welcome soldier
        soldier.accept(new SoldiderVisitor());
        soldier.accept(new CommanderVisitor());
        soldier.accept(new SergeantVisitor());


        //Welcome soldier.
        //Welcome commander
        commander.accept(new SoldiderVisitor());
        commander.accept(new CommanderVisitor());
        commander.accept(new SergeantVisitor());

        //Welcome soldier.
        //Welcome commander
        //Welcome sergeant
        sergeant.accept(new SoldiderVisitor());
        sergeant.accept(new CommanderVisitor());
        sergeant.accept(new SergeantVisitor());

    }
}
