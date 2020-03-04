package com.rms.service;

import java.util.List;
import java.util.Optional;

import com.rms.dao.EmployeeDao;
import com.rms.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Robert's batch
 *
 * 
 *         Employee Service
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeDao ed;

    public Employee findById(int id) {
        return ed.findById(id).orElse(new Employee());
    }

    public void save(Employee emp) {
        ed.save(emp);
    }

    public void update(Employee emp) {
        ed.save(emp);
    } 

    public Employee delete(Employee emp) {
        ed.delete(emp);
        return emp;
    }

    public List<Employee> findAll() {
        return (List<Employee>) ed.findAll();
    }
    
}