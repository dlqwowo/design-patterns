package AcyclicVisitor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class main {

    public static void main(String[] args) {
        Commander commander = new Commander(new Sergeant());
        //Welcome Commander
        //Welcome Sergeant
        commander.accept(new AllKnowVisitor());
        //Only CommanderVisitor is allowed to Commander
        //Welcome Sergeant
        commander.accept(new KnowSergeantVisitor());
    }
}
