package Command;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/21/2023
 */
public class Goblin extends Target {

    Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
