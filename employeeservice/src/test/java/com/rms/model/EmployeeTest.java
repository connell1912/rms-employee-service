package com.rms.model;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;
    
public class EmployeeTest {


    @Before
    public void setup(){
        
    }
        
    @Test
    public void testEmployee() {
       
        BeanTester bt = new BeanTester();
        Configuration configuration = new ConfigurationBuilder()
        .ignoreProperty("rmd")
        .iterations(1)
        .build();
        bt.testBean(Employee.class,configuration);
        Employee em = new Employee();
        em.setRmd(new ResourceMetadata());
        assertTrue(em.getRmd() != null);
        assertFalse(em.canEqual(null));
        assertTrue(em.canEqual(em));
        assertFalse(em.equals(null));
        assertTrue(em.equals(em));
        Employee e1 = new Employee(1, "firstName", "lastName", "email", "password", Department.HR,Title.STAGING_MANAGER,null);
        Employee e2 = new Employee(1, "firstName", "lastName", "email", "password", Department.HR,Title.STAGING_MANAGER,null);
        assertTrue(e1.equals(e2));
        assertTrue(em.hashCode() != 0);

    }
}
    