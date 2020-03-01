package com.rms.service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.rms.dao.EmployeeDao;
import com.rms.model.Department;
import com.rms.model.Employee;
import com.rms.model.Role;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MockEmployeeServiceTest {

    @InjectMocks
    EmployeeService es;

    @Mock
    EmployeeDao ed;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createEmployeeTest() {
        Employee emp = new Employee("Giorno", "Zeppeli", "golden@email.com", "requiemExperience", Department.QC,
                Role.TRAINER);
        es.save(emp);
        verify(ed, times(1)).save(emp);
    }

    @Test
    public void getEmployeeByIdTest() {
        when(ed.findById(1)).thenReturn(new Employee("Giorno", "Zeppeli", "golden@email.com", "requiemExperience", Department.QC, Role.TRAINER));
        Employee emp = es.findById(1);
        assertEquals("Giorno", emp.getFirstName());
        assertEquals("Zeppeli", emp.getLastName());
        assertEquals("golden@email.com", emp.getEmail());
    }

    @Test
    public void getAllEmployeesTest() {
        List<Employee> list = new ArrayList<>();
        Employee empOne = new Employee("firstName", "lastName", "someil***", "paswword", Department.RETENTION,
                Role.TRNG_MNGR);
        list.add(empOne);
        when(ed.findAll()).thenReturn(list);
        List<Employee> empList = es.findAll();
        assertEquals(1, empList.size());
        verify(ed, times(1)).findAll();
    }

    @Test
    public void updateEmployee() {
        Employee emp = new Employee("Giorno", "Zeppeli", "golden@email.com", "requiemExperience", Department.QC,
                Role.TRAINER);
        es.save(emp);
        Employee emp2 = es.findById(1);
        emp2 = new Employee("Giorno", "Zeppeli", "gold@email.com", "requiemExperience", Department.QC, Role.TRAINER);
        es.update(emp2);
        assertEquals("gold@email.com", emp2.getEmail());
    }

    @Test
    public void deleteEmployee() {
        Employee emp = new Employee("Giorno", "Zeppeli", "golden@email.com", "requiemExperience", Department.QC,
                Role.TRAINER);
        es.save(emp);
        Employee emp2 = es.findById(1);
        es.delete(emp2);
        Employee emp3 = es.findById(1);
        assertFalse(emp3 != null);
    }

}
