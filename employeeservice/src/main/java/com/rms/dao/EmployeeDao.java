package com.rms.dao;

import org.springframework.data.repository.CrudRepository;

import com.rms.model.*;

public interface EmployeeDao extends CrudRepository <Employee, Integer> {
    
}