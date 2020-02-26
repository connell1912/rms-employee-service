package com.rms.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * An employee
 */

@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    @Column
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String title;
    private Department department;
    private ResourceMetadata rmd;

    @Enumerated(EnumType.ORDINAL)
    private Role role;

    public Employee() {
    }

    public Employee(int empId, String firstName, String lastName, String email, String password, String title,
            Department department, ResourceMetadata rmd) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.title = title;
        this.department = department;
        this.rmd = rmd;
    }

    public Employee(String firstName, String lastName, String email, String password, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ResourceMetadata getRmd() {
        return this.rmd;
    }

    public void setRmd(ResourceMetadata rmd) {
        this.rmd = rmd;
    }

    public Employee empId(int empId) {
        this.empId = empId;
        return this;
    }

    public Employee firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Employee lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Employee email(String email) {
        this.email = email;
        return this;
    }

    public Employee password(String password) {
        this.password = password;
        return this;
    }

    public Employee title(String title) {
        this.title = title;
        return this;
    }

    public Employee department(Department department) {
        this.department = department;
        return this;
    }

    public Employee rmd(ResourceMetadata rmd) {
        this.rmd = rmd;
        return this;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(firstName, employee.firstName)
                && Objects.equals(lastName, employee.lastName) && Objects.equals(email, employee.email)
                && Objects.equals(password, employee.password) && Objects.equals(title, employee.title)
                && Objects.equals(department, employee.department) && Objects.equals(rmd, employee.rmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, firstName, lastName, email, password, title, department, rmd);
    }

    @Override
    public String toString() {
        return "{" + " empId='" + getEmpId() + "'" + ", firstName='" + getFirstName() + "'" + ", lastName='"
                + getLastName() + "'" + ", email='" + getEmail() + "'" + ", password='" + getPassword() + "'"
                + ", title='" + getTitle() + "'" + ", department='" + getDepartment() + "'" + ", rmd='" + getRmd() + "'"
                + "}";
    }

}
