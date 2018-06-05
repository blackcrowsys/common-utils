package com.blackcrowsys.commonutils.json;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JSON Converter using Jackson.
 */
import java.io.IOException;

public class JacksonConverter {

    private JacksonConverter(){
        // To stop anyone from creating an instance of this class.
    }

    /**
     * Convert an object to a byte array.
     *
     * @param mapper the configured Jackson object mapper
     * @param t      the object to convert
     * @param <T>    the type of the object to convert
     * @return byte array representing the object
     * @throws IOException exception
     */
    public static <T> byte[] convertToJsonBytes(ObjectMapper mapper, T t) throws IOException {
        return mapper.writeValueAsBytes(t);
    }
}
