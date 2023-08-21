package Command;

import lombok.RequiredArgsConstructor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/21/2023
 */
@RequiredArgsConstructor
public enum Size {

    SMALL("small"),
    NORMAL("normal");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
