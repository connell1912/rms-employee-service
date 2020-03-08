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

    public EmployeeDto(String firstName, String lastName, String email, String password, String department, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.department = department;
        this.title = title;
    }

    public EmployeeDto(Employee e) {
        this.firstName = e.getFirstName();
        this.lastName = e.getLastName();
        this.email = e.getEmail();
        this.password = e.getPassword();
        this.department = e.getDepartment().toString();
        this.title = e.getTitle().toString();
	}

    public EmployeeDto() {
	}

    public Employee getEmployee(){
        return new Employee(this.firstName, this.lastName, this.email,
         this.password, Department.convertStringToEnum(department),
          Title.convertStringToEnum(title));
    }
    
	@Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", department='" + getDepartment() + "'" +
            ", title='" + getTitle() + "'" +
            "}";
    }
    

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getTitle() {
        return this.title;
    }


}