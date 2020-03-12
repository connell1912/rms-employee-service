package com.rms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  @author 1912Java15
 * 
 *  Lombok was used to reduce the amount of coding.
 *      @Data will create the setters and getters for us.
 *      @-----Constructor will create the needed constructors for us.
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
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    /**
     * @author 1912dec16 Java Fullstack Batch
     * 
     *      @Enumerated denotes that enums will be persisted to the db.
     *      EnumType.STRING lets the db know that the format will be as a string.
     */
    @Enumerated(EnumType.STRING)
    private Department department;
    @Enumerated(EnumType.STRING)
    private Title title;

    public Employee(String firstName, String lastName, String email, String password, Department department,
            Title title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.department = department;
        this.title = title;
    }

    
}
