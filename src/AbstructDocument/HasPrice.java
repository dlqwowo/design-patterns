package AbstructDocument;

import java.util.Optional;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/9/2023
 */
public interface HasPrice extends Document {

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(Property.PRICE.toString()));
    }
}
