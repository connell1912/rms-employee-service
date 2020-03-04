package com.rms.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
    
public class RoleTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        assertEquals("ADMIN", Role.ADMIN.name(), "Error with enum");
        assertEquals("BLDG_MNGR", Role.BLDG_MNGR.name(), "Error with enum");
        assertEquals("LOCKED", Role.LOCKED.name(), "Error with enum");
        assertEquals("TRAINER", Role.TRAINER.name(), "Error with enum");
        assertEquals("TRNG_MNGR", Role.TRNG_MNGR.name(), "Error with enum");
    }
}
    