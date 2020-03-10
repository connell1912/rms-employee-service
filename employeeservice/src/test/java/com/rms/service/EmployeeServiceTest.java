package com.rms.service;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import com.rms.model.Department;
import com.rms.model.Employee;
import com.rms.model.Title;

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
        ed.saveOrUpdate(new Employee("firstName", "lastName", "someemail", "password", Department.RETENTION,
                Title.TRAINING_MANAGER));
        System.out.println("****************Test**************** \n" + ed.findByEmail("someemail"));
        assertTrue(ed.findByEmail("someemail") != null);
    }

    @Test
    public void findByIdTest() {
        // ed.save
        // (new Employee("firstName", "lastName", "someil***", "paswword",
        // Department.RETENTION, Title.TRNG_MNGR));
        Employee emp = ed.findByEmail("someemail");
        System.out.println("***********\n"+emp);
        assertNotNull(emp);
    }

    @Test
    public void updateTest() {

        System.out.println("*********************update\n");
        Employee emp = ed.findByEmail("someemail");
        System.out.println(emp);
        emp.setFirstName("updatedTest");
        ed.saveOrUpdate(emp);
        assertTrue(ed.findByEmail("someemail").getFirstName().equals("updatedTest"));
    }

    @Test
    public void deleteTest() {
        Employee emp = new Employee("Kira", "Kira", "killaQueen@jojo.ora", "password", Department.HR, Title.HR_LEAD);
        ed.saveOrUpdate(emp);
        assertTrue(ed.delete(emp) != null);
    }

    @Test
    public void findAllTest() {
        List<Employee> ls = (List<Employee>) ed.findAll();
        System.out.println("\n***********:\n"+ls);
        assertTrue(ls != null);
    }


}
    