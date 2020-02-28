package com.rms.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;


public class EmployeeTest {

    @Before
    public void setup(){
    
    }

        
    @Test
    public void testConstructor() {
        Employee em = new Employee("tester", "test", "test@email.test", "password", Department.QC, Role.BLDG_MNGR);
        assertTrue(em.equals(new Employee("tester", "test", "test@email.test", "password", Department.QC, Role.BLDG_MNGR)) );
    }
}
    