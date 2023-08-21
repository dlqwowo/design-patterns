package Command;

import lombok.RequiredArgsConstructor;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/21/2023
 */

@RequiredArgsConstructor
public enum Visibility {

    VISIBLE("visible"),
    INVISIBLE("invisible");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
