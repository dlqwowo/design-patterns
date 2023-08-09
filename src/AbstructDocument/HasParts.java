package AbstructDocument;


import java.util.stream.Stream;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/9/2023
 */
public interface HasParts extends Document {

    default Stream<Part> getParts() {
        return children(Property.PARTS.toString(), Part::new);
    }
}
