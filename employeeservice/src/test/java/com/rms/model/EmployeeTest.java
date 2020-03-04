package com.rms.model;

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
    public void testEmployeeBean() {
        Configuration configuration = new ConfigurationBuilder()
        .ignoreProperty("rmd")  //tested separately
        .build();
        new BeanTester().testBean(Employee.class,configuration);










        
    }
}
    