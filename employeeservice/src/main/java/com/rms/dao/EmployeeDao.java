package com.rms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

import com.rms.model.*;

@Repository
@Transactional
public interface EmployeeDao extends CrudRepository <Employee, Integer> {
    
}