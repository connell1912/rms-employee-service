package com.rms.service;

import java.util.ArrayList;
import java.util.List;

import com.rms.dao.EmployeeDao;
import com.rms.dto.EmployeeDto;
import com.rms.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Robert's batch
 *
 * 
 *         Employee Service
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeDao ed;

    public EmployeeDto findByEmail(String email) {
        Employee empl =  ed.findByEmail(email);
        return new EmployeeDto(empl);
    }

    public EmployeeDto saveOrUpdate(EmployeeDto emp) {
        ed.save(emp.getEmployee());
        return emp;
    } 

    public EmployeeDto delete(EmployeeDto emp) {
        ed.delete(emp.getEmployee());
        return emp;
    }

    public List<EmployeeDto> findAll() {
        ArrayList<Employee> list = (ArrayList<Employee>) ed.findAll();
        ArrayList<EmployeeDto> allDto = new ArrayList<>();
        for(Employee empl : list){
            EmployeeDto ed = new EmployeeDto(empl);
            allDto.add(ed);
        }
        System.out.println(allDto);
        return allDto;
    }
    
}