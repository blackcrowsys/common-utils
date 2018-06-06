package com.blackcrowsys.commonutils.encryption;

import org.junit.Before;
import org.junit.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.Assert.assertTrue;

public class PasswordEncoderUtilsTests {

    private static final String PASS_WD = "Password1234";

    private PasswordEncoder encoder;

    @Before
    public void setUp(){
        encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Test
    public void testGeneratingPassword(){
        String encoded = PasswordEncoderUtils.encode(encoder, PASS_WD);

        System.out.println("Encoded:" + encoded);
        assertTrue(encoder.matches(PASS_WD, encoded));
    }
}
