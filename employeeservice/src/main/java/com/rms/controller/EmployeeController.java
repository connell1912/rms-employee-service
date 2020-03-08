package com.rms.controller;

import java.util.List;

import com.rms.dto.EmployeeDto;
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
@CrossOrigin(origins={"http://localhost:3000"})
public class EmployeeController {

    @Autowired
    private EmployeeService es;
    
    @GetMapping(value = "/{email}")
    public EmployeeDto getByEmail(@PathVariable("email") String email) {
        return es.findByEmail(email);
    }
    
    @DeleteMapping(value = "/remove")
	public EmployeeDto delete(@RequestBody EmployeeDto emp) {
		return es.delete(emp);
    } 

    @PostMapping(value = "/save")
	public EmployeeDto save(@RequestBody EmployeeDto emp) {
        es.saveOrUpdate(emp);
        return emp;
    }
    
    @GetMapping(value = "/all",produces = "application/json")
	public List<EmployeeDto> getAll(){
		return es.findAll();
    }
    
}