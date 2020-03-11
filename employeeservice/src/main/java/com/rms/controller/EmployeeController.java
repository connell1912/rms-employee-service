package com.rms.controller;

import java.util.List;

import com.rms.model.Employee;
import com.rms.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EmployeeController
 */
@RestController
@RequestMapping(value = "/employee")
@CrossOrigin(origins = { "http://localhost:3000" })
public class EmployeeController {

    @Autowired
    private EmployeeService es;

    @GetMapping(value = "/{email}")
    public Employee getByEmail(@PathVariable("email") String email) {
        return es.findByEmail(email);
    }

    @DeleteMapping(value = "/remove")
    public Employee delete(@RequestBody String email) {
        return es.deleteByEmail(email);
    }

    @PostMapping(value = "/save", consumes = "application/json")
    public Employee save(@RequestBody Employee emp) {
        return es.saveOrUpdate(emp);
    }

    @GetMapping(value = "/all", produces = "application/json")
    public List<Employee> getAll() {
        return es.findAll();
    }

    @PostMapping(value = "/login")
    public Employee login(@RequestBody Employee el){
        boolean resp = es.login(el.getEmail(),el.getPassword());
        if(resp){
            return es.findByEmail(el.getEmail());
        }
        return null;
    }

    
}