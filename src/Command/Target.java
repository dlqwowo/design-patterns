package Command;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/21/2023
 */

@Setter
@Getter
public abstract class Target {

    private Size size;

    private Visibility visibility;

    void changeSize() {
        Size newSize = getSize() == Size.NORMAL ? Size.SMALL : Size.NORMAL;
        setSize(newSize);
    }

    void changeVisibility() {
        Visibility newVisibility = getVisibility() == Visibility.VISIBLE ?
                Visibility.INVISIBLE : Visibility.VISIBLE;
        setVisibility(newVisibility);
    }

    /**
     * Print status.
     */
    public void printStatus() {
        System.out.println(String.format("%s, [size=%s] [visibility=%s]", this, getSize(), getVisibility()));
    }
}
