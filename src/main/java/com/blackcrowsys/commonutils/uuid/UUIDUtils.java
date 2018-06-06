package com.blackcrowsys.commonutils.uuid;

import java.util.UUID;

public class UUIDUtils {

    private UUIDUtils() {
        // as this is a util class.
    }

    public static UUID generateRandom() {
        return UUID.randomUUID();
    }
}
