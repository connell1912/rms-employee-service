package com.rms.service;

import com.rms.model.Employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeService extends CrudRepository <Employee, Integer> {

    
}