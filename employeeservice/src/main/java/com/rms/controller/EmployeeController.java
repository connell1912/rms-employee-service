package com.rms.controller;

import java.util.List;

import com.rms.dto.EmployeeDto;
import com.rms.facades.EmployeeData;
import com.rms.facades.EmployeeLogin;
import com.rms.model.Employee;
import com.rms.service.EmployeeService;

import org.modelmapper.ModelMapper;
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

    @Autowired
    private ModelMapper modelMapper;

    private EmployeeDto dto;

    @GetMapping(value = "/{email}")
    public EmployeeData getByEmail(@PathVariable("email") String email) {
        return dto.convertToDto(es.findByEmail(email));
    }

    @DeleteMapping(value = "/remove")
    public EmployeeData delete(@RequestBody String email) {
        return dto.convertToDto((Employee) es.deleteByEmail(email));
    }

    @PostMapping(value = "/save", consumes = "application/json")
    public EmployeeData save(@RequestBody Employee emp) {
        Employee e = es.saveOrUpdate(emp);
        return dto.convertToDto(e);
    }

    @GetMapping(value = "/all", produces = "application/json")
    public List<EmployeeData> getAll() {
        List<EmployeeData> list = (List<EmployeeData>) es.findAll().stream().map(e -> dto.convertToDto(e));
        return list;
    }

    @PostMapping(value = "/login")
    public EmployeeData login(@RequestBody EmployeeLogin el){
        boolean resp = es.login(el.getEmail(),el.getPassword());
        EmployeeData edata = new EmployeeData();
        if(resp){
            Employee e  = es.findByEmail(el.getEmail());
            edata.addEmployee(e);
        }
        return edata;
    }

    
}