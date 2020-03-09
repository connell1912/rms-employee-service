package com.rms.dto;

import com.rms.model.Department;
import com.rms.model.Employee;
import com.rms.model.Title;

/**
 * EmployeeDto
 */
public class EmployeeDto {

    //Fields being sent/received
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department; //TRAINING, STAGING, QC, RETENTION, HR
    private String title; //TRAINING_MANAGER, STAGING_MANAGER, HR_LEAD, TRAINING_LEAD

    //Methods

    //Getter setters and Constructor 


    public EmployeeDto(Employee e) {
        this.firstName = e.getFirstName();
        this.lastName = e.getLastName();
        this.email = e.getEmail();
        this.password = e.getPassword();
        this.department = e.getDepartment().toString();
        this.title = e.getTitle().toString();
	}

    public Employee getEmployee(){
        return new Employee(this.firstName, this.lastName, this.email,
         this.password, Department.convertStringToEnum(department),
          Title.convertStringToEnum(title));
    }
    


}