package com.revychan.service;

import com.revychan.model.Employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeService extends CrudRepository <Employee, Integer> {

    
}