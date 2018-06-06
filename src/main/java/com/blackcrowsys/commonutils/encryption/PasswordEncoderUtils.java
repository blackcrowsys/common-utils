package com.blackcrowsys.commonutils.encryption;

import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderUtils {

    private PasswordEncoderUtils(){
        // as this is a util class.
    }

    public static String encode(PasswordEncoder encoder, String text) {
        return encoder.encode(text);
    }
}
