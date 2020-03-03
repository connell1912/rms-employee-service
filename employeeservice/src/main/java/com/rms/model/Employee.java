package com.rms.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * An employee
 */

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String firstName;
    @Setter
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Department department;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToOne
    private ResourceMetadata rmd;

    public Employee(String firstName, String lastName, String email, String password, Department department,
            Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.department = department;
        this.role = role;
    }

    public Employee(String firstName, String lastName, String email, String password, Department department, Role role,
            ResourceMetadata rmd) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.department = department;
        this.role = role;
        this.rmd = rmd;
    }

    public Employee(int empId, String firstName, String lastName, String email, String password, Department department,
            Role role) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.department = department;
        this.role = role;
    }

    @Override
    public String toString() {
        return "{" + " empId='" + getEmpId() + "'" + ", firstName='" + getFirstName() + "'" + ", lastName='"
                + getLastName() + "'" + ", email='" + getEmail() + "'" + ", password='" + getPassword() + "'"
                + ", department='" + getDepartment() + "'" + ", role='" + getRole() + "'" + "}";
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
                && Objects.equals(password, employee.password) && Objects.equals(department, employee.department)
                && Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, firstName, lastName, email, password, department, role);
        
    }

    

}
