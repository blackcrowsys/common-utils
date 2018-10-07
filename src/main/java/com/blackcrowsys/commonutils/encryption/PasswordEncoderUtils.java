package com.blackcrowsys.commonutils.encryption;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderUtils {

    private PasswordEncoderUtils() {
        // as this is a util class.
    }

    public static String encode(PasswordEncoder encoder, String text) {
        return encoder.encode(text);
    }

    public static String encode(String text) {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        return passwordEncoder.encode(text);
    }
}
