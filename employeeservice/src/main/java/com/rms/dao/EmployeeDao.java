package com.rms.dao;

import com.rms.model.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 1912dec16 Java Fullstack Batch
 * <br>
 * <br>
 * The EmployeeDao interface communicates with our H2 database. It utilizes Spring Data and extends the 
 * CrudRepository which gives us access to built in CRUD methods and allows to create abstract methods using 
 * naming conventions that the CrudRepository recognizes and is able provide default implementation.
 */
@Repository
@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    
    

    Employee findByEmail(String email);

	Employee deleteByEmail(String email);
    

 
}