package com.rms.service;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import com.rms.model.Department;
import com.rms.model.Employee;
import com.rms.model.Role;
import com.rms.service.EmployeeService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService ed;

    @Test
    public void testEmployeeService() {
        assertTrue(ed != null);
    }

    @Test
    public void saveTest() {
        ed.save
        (new
         Employee(4,"firstName", "lastName", "someemail", "password", 
         Department.RETENTION, Role.TRNG_MNGR));
        System.out.println("****************Test**************** \n"+ed.findById(1));
        assertTrue(ed.findById(1) != null);
    }

    @Test
    public void findByIdTest() {
        // ed.save
        // (new Employee("firstName", "lastName", "someil***", "paswword", Department.RETENTION, Role.TRNG_MNGR));
        Employee emp = ed.findById(1);
        System.out.println("***********\n"+emp);
        assertNotNull(emp);
    }

    @Test
    public void updateTest() {

        System.out.println("*********************update\n");
        Employee emp = ed.findById(1);
        System.out.println(emp);
        emp.setFirstName("updatedTest");
        ed.save(emp);
    }

    @Test
    public void deleteTest() {
        Employee emp = new Employee("Kira", "Kira", "killaQueen@jojo.ora", "password", Department.HR, Role.TRAINER);
        ed.save(emp);
        assertTrue(ed.delete(emp) != null);
    }

    @Test
    public void findAllTest() {
        List<Employee> ls = (List<Employee>) ed.findAll();
        System.out.println("\n***********:\n"+ls);
        assertTrue(ls != null);
    }

}
    