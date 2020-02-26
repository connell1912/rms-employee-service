package com.rms.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * An employee
 */

@Entity
@Table
public class Employee {

    @Id
    @SequenceGenerator(name = "EmpID_seq", sequenceName = "EmpID_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EmpID_seq")
    private int empId;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    // private String title;
    // @Enumerated(EnumType.STRING)
    private Department department;

    // private ResourceMetadata meta;

    // @Enumerated(EnumType.STRING)
    private Role role;


    public Employee() {
        super();
    }
    
    public Employee(String firstName , String lastName , String email , String password , Department dpt, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.department = dpt;
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

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ResourceMetadata getMeta() {
        return this.meta;
    }

    public void setMeta(ResourceMetadata meta) {
        this.meta = meta;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "{" +
            " empId='" + getEmpId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", department='" + getDepartment() + "'" +
            ", meta='" + getMeta() + "'" +
            ", role='" + getRole() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(email, employee.email) && Objects.equals(password, employee.password) && Objects.equals(department, employee.department) && Objects.equals(meta, employee.meta) && Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, firstName, lastName, email, password, department, meta, role);
    }



    

    
    

}
