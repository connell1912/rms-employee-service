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
        // emp = new Employee(23, "testFirst", "testLast", "testEmail", "testPass", Department.HR, Role.ADMIN, null);
        // emp.setRmd(new ResourceMetadata(22, 1, new Timestamp(System.currentTimeMillis()), 1, new Timestamp(System.currentTimeMillis()), 1));
        // assertEquals("testEmail", emp.getEmail());  
        // assertEquals(23, emp.getEmpId()); 
        // assertEquals("testFirst", emp.getFirstName()); 
        // assertEquals("testLast", emp.getLastName()); 
        // assertEquals(Department.HR, emp.getDepartment()); 
        // assertEquals(Role.ADMIN, emp.getRole()); 
        // Assert.assertTrue(emp.getRmd() != null); 
        // Assert.assertTrue(emp.toString() != null);
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
        em.hashCode();

    }
}
    