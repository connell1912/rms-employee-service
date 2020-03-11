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

    @Test
    public void testConvert(){
        assertEquals(Title.HR_LEAD, Title.convertStringToEnum("HR_LEAD"));
        assertEquals(Title.STAGING_MANAGER, Title.convertStringToEnum("STAGING_MANAGER"));
        assertEquals(Title.TRAINING_LEAD, Title.convertStringToEnum("TRAINING_LEAD"));
        assertEquals(Title.TRAINING_MANAGER, Title.convertStringToEnum("TRAINING_MANAGER"));
    }
}
    