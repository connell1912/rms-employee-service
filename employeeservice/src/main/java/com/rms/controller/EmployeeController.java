package com.rms.controller;

import com.rms.dao.EmployeeDao;
import com.rms.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * EmployeeController
 */

 @RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao ed;

    @GetMapping(value = "/{id}")
    public Employee getById(@PathVariable("id") int id){
        return ed.getById(id);
    }

    

    
}