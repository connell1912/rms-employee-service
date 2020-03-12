package com.rms.service;

import java.util.List;

import com.rms.dao.EmployeeDao;
import com.rms.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 1912Java15
 *
 *      The dao is wired where we can use the methods in the service layer. 
 *      Spring takes care on instatiating the dao layer for us.
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeDao ed;

    public Employee findByEmail(String email) {
        return ed.findByEmail(email);
    }

    public Employee saveOrUpdate(Employee emp) {
        return ed.save(emp);
    } 

    public Employee delete(Employee emp) {
        ed.delete(emp);
        return emp;
    }

    public List<Employee> findAll() {
        return (List<Employee>) ed.findAll();
    }

	public boolean login(String email , String password) {
        Employee emp = ed.findByEmail(email);
        return (emp.getPassword().equals(password));
	}

	public Employee deleteByEmail(String email) {
		return ed.deleteByEmail(email);
	}
    
}