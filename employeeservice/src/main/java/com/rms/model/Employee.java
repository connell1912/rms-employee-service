package com.rms.model;

/**
 * An employee 
 */
public class Employee {

    private int empId;
    private String firstName;
    private String lastName;
    private String email;
    private String title;
    private Department department;
    private ResourceMetadata rmd;

    public int empId() {
        return empId;
    }

    public void setempId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ResourceMetadata getRmd() {
        return rmd;
    }

    public void setRmd(ResourceMetadata rmd) {
        this.rmd = rmd;
    }

    @Override
    public String toString() {
        return "Employee [department=" + department + ", email=" + email + ", firstName=" + firstName + ", empId=" + empId
                + ", lastName=" + lastName + ", rmd=" + rmd + ", title=" + title + "]";
    }

    public Employee(int empId, String firstName, String lastName, String email, String title, Department department,
            ResourceMetadata rmd) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.department = department;
        this.rmd = rmd;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + empId;
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((rmd == null) ? 0 : rmd.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (department != other.department)
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (empId != other.empId)
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (rmd == null) {
            if (other.rmd != null)
                return false;
        } else if (!rmd.equals(other.rmd))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }
}

