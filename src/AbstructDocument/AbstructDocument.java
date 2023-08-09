package AbstructDocument;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/9/2023
 */
public abstract class AbstructDocument implements Document {
    Map<String, Object> properties = new HashMap<>();

    AbstructDocument(Map<String, Object> properties) {
        Objects.requireNonNull(properties, "properties need not null");
        this.properties = properties;
    }

    @Override
    public void put(String key, Object value) {
        this.properties.put(key, value);
    }

    @Override
    public Object get(String key) {
        return this.properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> construction) {
        return Stream.of(get(key))
                .filter(Objects::nonNull)
                .map(el -> (List<Map<String,Object>>) el)
                .findAny()
                .get()
                .stream()
                .map(construction);
    }
}
