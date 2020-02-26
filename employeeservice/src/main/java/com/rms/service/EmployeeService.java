package com.rms.service;

import com.rms.dao.EmployeeDao;
import com.rms.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Robert's batch
 *
 * 
 * Employee Service
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeDao ed;

    public void save(Employee emp) {
        ed.save(emp);
    }

    public void delete(Employee emp) {
        ed.delete(emp);
    }



}