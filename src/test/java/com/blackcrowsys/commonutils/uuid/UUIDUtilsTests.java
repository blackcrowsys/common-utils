package com.blackcrowsys.commonutils.uuid;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertTrue;

public class UUIDUtilsTests {

    @Test
    public void testGeneratingUUID(){
        UUID uuid = UUIDUtils.generateRandom();

        System.out.println("UUID:" + uuid.toString());
        assertTrue(uuid.toString().length() == 36);
    }
}
