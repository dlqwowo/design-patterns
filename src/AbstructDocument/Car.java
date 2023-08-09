package AbstructDocument;

import java.util.Map;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/9/2023
 */
public class Car extends AbstructDocument implements HasPrice,HasType,HasModel,HasParts{
    Car(Map<String, Object> properties) {
        super(properties);
    }

}
