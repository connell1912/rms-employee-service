package com.rms.dto;

import com.rms.facades.EmployeeData;
import com.rms.model.Employee;

/**
 * EmployeeDto
 */
public class EmployeeDto {


    public EmployeeData convertToDto(Employee e){
        EmployeeData edata = new EmployeeData();
        edata.addEmployee(e);
        return edata;
    }

    private Employee convertToEmployee(EmployeeData e) {
        return new Employee(e.getFirstName(), e.getLastName(), e.getEmail(), "", e.getDepartment(), e.getTitle(), null);
    }
    


}