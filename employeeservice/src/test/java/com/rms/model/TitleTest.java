package com.rms.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;


    public class TitleTest {

    @Before
    public void setup(){

    }

    @Test
    public void test() {
        assertEquals("TRAINING_MANAGER", Title.TRAINING_MANAGER.name(), "Error with enum");
        assertEquals("STAGING_MANAGER", Title.STAGING_MANAGER.name(), "Error with enum");
        assertEquals("HR_LEAD", Title.HR_LEAD.name(), "Error with enum");
        assertEquals("TRAINING_LEAD", Title.TRAINING_LEAD.name(), "Error with enum");
    }

    @Test
    public void testEnum(){
        System.out.println(Title.HR_LEAD.toString());
        assertEquals("HR_LEAD",Title.HR_LEAD.toString());
    }
}
    