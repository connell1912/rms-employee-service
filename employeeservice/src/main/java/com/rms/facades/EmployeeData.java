package com.rms.facades;

import java.util.Objects;

import com.rms.model.Department;
import com.rms.model.Employee;
import com.rms.model.Title;

/**
 * EmployeeData
 */
public class EmployeeData {

    private String firstName;

    private String lastName;

    private String email;

    private Department department;

    private Title title;

    public EmployeeData(){

    }

    public EmployeeData(String firstName, String lastName, String email, Department department, Title title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.title = title;
    }

    @Override
    public String toString() {
        return "{" +
            " firstName='" + firstName + "'" +
            ", lastName='" + lastName + "'" +
            ", email='" + email + "'" +
            ", department='" + department + "'" +
            ", title='" + title + "'" +
            "}";
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Title getTitle() {
        return this.title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeData)) {
            return false;
        }
        EmployeeData employeeData = (EmployeeData) o;
        return Objects.equals(firstName, employeeData.firstName) && Objects.equals(lastName, employeeData.lastName) && Objects.equals(email, employeeData.email) && Objects.equals(department, employeeData.department) && Objects.equals(title, employeeData.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, department, title);
    }

	public void addEmployee(Employee e) {
        
        this.firstName = e.getFirstName();
        this.lastName = e.getLastName();
        this.email = e.getEmail();
        this.department = e.getDepartment();
        this.title = e.getTitle();
	}
    
}