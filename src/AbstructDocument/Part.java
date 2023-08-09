package AbstructDocument;

import java.util.Map;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/9/2023
 */
public class Part extends AbstructDocument implements HasPrice, HasType,HasModel {

    Part(Map<String, Object> properties) {
        super(properties);
    }

}
