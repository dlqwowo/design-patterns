package AbstructDocument;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/9/2023
 */
public class main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("");

        Map<String,Object> carProperties = new HashMap<>(4);
        carProperties.put(Property.PRICE.toString(),50);
        carProperties.put(Property.MODEL.toString(),"model-y");
        carProperties.put(Property.TYPE.toString(),"car");

        Map<String,Object> wheelProperties = new HashMap<>(3);
        wheelProperties.put(Property.PRICE.toString(),10);
        wheelProperties.put(Property.MODEL.toString(),"wheel-y");
        wheelProperties.put(Property.TYPE.toString(),"wheel");

        Map<String,Object> doorProperties = new HashMap<>(3);
        doorProperties.put(Property.PRICE.toString(),40);
        doorProperties.put(Property.MODEL.toString(),"door-y");
        doorProperties.put(Property.TYPE.toString(),"door");


        carProperties.put(Property.PARTS.toString(), Arrays.asList(wheelProperties,doorProperties));

        Car car = new Car(carProperties);
        System.out.println("car type:" +  car.getType().get());
        System.out.println("car model:" +  car.getModel().get());
        System.out.println("car price:" +  car.getPrice().get());
        car.getParts().forEach( p ->
            System.out.println("type:" + p.getType().get() + "/model:" + p.getModel().get() + "/price:" + p.getPrice().get())
        );
    }
}
