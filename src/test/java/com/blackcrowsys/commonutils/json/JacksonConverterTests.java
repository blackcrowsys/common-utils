package com.blackcrowsys.commonutils.json;

import com.blackcrowsys.commonutils.testmodels.Pojo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class JacksonConverterTests {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testConvertingObjectToJsonBytes() throws IOException {
        Pojo pojo = new Pojo("test", "Json");

        byte[] json = JacksonConverter.convertToJsonBytes(mapper, pojo);
        assertEquals("{\"key\":\"test\",\"value\":\"Json\"}", new String(json));
    }
}
