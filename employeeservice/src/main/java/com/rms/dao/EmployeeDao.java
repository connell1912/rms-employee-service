package com.rms.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import com.rms.model.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    
    Employee findById(int id);

	Employee findByEmail(String email);

}