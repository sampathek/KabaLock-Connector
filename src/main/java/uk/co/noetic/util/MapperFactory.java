package uk.co.noetic.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperFactory {

    private static volatile ObjectMapper mapper = null;

    public static ObjectMapper getMappper() {
        if (null == mapper) {
            mapper = new ObjectMapper();
            mapper.configure(MapperFeature.USE_ANNOTATIONS, true);
            mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        }
        return mapper;
    }
}
