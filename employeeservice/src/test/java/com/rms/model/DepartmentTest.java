package com.rms.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
    
public class DepartmentTest {

        
    @Test
    public void test() {
        assertEquals("HR", Department.HR.name(), "Error with enum");
        assertEquals("QC", Department.QC.name(), "Error with enum");
        assertEquals("RETENTION", Department.RETENTION.name(), "Error with enum");
        assertEquals("STAGING", Department.STAGING.name(), "Error with enum");
        assertEquals("TRAINING", Department.TRAINING.name(), "Error with enum");
    }
}
    