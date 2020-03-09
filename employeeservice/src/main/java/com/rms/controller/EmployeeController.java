package com.rms.controller;

import java.util.List;
import java.util.stream.Stream;

import com.rms.dto.EmployeeDto;
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

    @GetMapping(value = "/{email}")
    public EmployeeDto getByEmail(@PathVariable("email") String email) {
        return convertToDto(es.findByEmail(email));
    }

    @DeleteMapping(value = "/remove")
    public EmployeeDto delete(@RequestBody EmployeeDto emp) {
        return convertToDto(es.delete(convertToEmployee(emp)));
    }

    @PostMapping(value = "/save", consumes = "application/json")
    public Employee save(@RequestBody Employee emp) {
        es.saveOrUpdate(emp);
        return emp;
    }

    @GetMapping(value = "/all", produces = "application/json")
    public Stream<EmployeeDto> getAll() {
        return es.findAll().stream()
        .map(this::convertToDto);
    }

    private EmployeeDto convertToDto(Employee ed) {
        EmployeeDto dto = new EmployeeDto(ed);
        return dto;
    }

    private Employee convertToEmployee(EmployeeDto emd) {
        return emd.getEmployee();
    }
}