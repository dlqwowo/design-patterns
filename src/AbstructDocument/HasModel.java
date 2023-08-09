package AbstructDocument;

import java.util.Optional;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/9/2023
 */
public interface HasModel extends Document{

    default Optional<String> getModel(){
        return Optional.ofNullable((String)get(Property.MODEL.toString()));
    }
}
