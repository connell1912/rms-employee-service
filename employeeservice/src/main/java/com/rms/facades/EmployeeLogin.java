package com.rms.facades;

import java.util.Objects;

/**
 * EmployeeLogin
 */
public class EmployeeLogin {

    private String email;

    private String password;


    public EmployeeLogin(String email, String password) {
        this.email = email;
        this.password = password;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeLogin)) {
            return false;
        }
        EmployeeLogin employeeLogin = (EmployeeLogin) o;
        return Objects.equals(email, employeeLogin.email) && Objects.equals(password, employeeLogin.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }

    @Override
    public String toString() {
        return "{" +
            " email='" + email + "'" +
            ", password='" + password + "'" +
            "}";
    }

}