package com.rms.dao;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
    
public class EmployeeDaoTest {
    
    @Autowired 
    EmployeeDao ed;

    @Before
    public void setup(){
        
    }
        
    @Test
    public void test() {
        assertTrue(true);
    }
}
    