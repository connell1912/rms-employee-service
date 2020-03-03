package com.rms.controller;

import com.rms.model.Employee;
import com.rms.service.EmployeeService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * EmployeeController
 */
@RestController
@RequestMapping(value = "/employee")
@CrossOrigin(origins={"http://localhost:3000"})
public class EmployeeController {

    @Autowired
    private EmployeeService es;

    @PostMapping(value = "/auth")
    public @ResponseBody Employee authenticate(@RequestBody Employee emp) {
      return emp != null ? es.authenticate(emp) : emp;
    }

    @GetMapping(value = "/{id}")
    public Employee getById(@PathVariable("id") int id) {
        return es.findById(id);
    }

    @PostMapping
	public void save(@RequestBody Employee emp) {
		es.save(emp);
    }
    
    @DeleteMapping("/employee")
	public void delete(@RequestBody Employee emp) {
		es.delete(emp);
    } 

    @PostMapping("/old")
	public void update(@RequestBody Employee emp) {
		es.update(emp);
    }
    
    @GetMapping("/all")
	public Iterable<Employee> getAll(){
		return es.findAll();
    }
    
    
    
}