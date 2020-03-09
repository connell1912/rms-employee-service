package com.rms.dao;

import com.rms.dto.EmployeeDto;
import com.rms.model.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    
    

    Employee findByEmail(String email);
    

 
}