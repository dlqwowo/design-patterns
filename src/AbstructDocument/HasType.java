package AbstructDocument;

import java.util.Optional;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/9/2023
 */
public interface HasType extends Document {

    default Optional<String> getType() {
        return Optional.ofNullable((String) get(Property.TYPE.toString()));
    }
}
