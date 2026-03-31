package com.prachi9.springboot_mvc_demo.controller;

import com.prachi9.springboot_mvc_demo.repositories.EmployeeRepository;
import com.prachi9.springboot_mvc_demo.entities.EmployeeEntity;
import org.springframework.web.bind.annotation.*;
import com.prachi9.springboot_mvc_demo.dto.EmployeeDTO;
import java.util.List;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

//    @GetMapping(path = "/getsecretmsg")
//    public String getSecretMsg() {
//        return "Secret Message: gygsuise";
//    }
private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @GetMapping("/{employeeID}")
    public EmployeeEntity getEmployeeByID (@PathVariable(name="employeeID") Long id)
    {
        return employeeRepository.findById(id).orElse(null);
    }
    @GetMapping()
    public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false) Integer age)
    {
        return employeeRepository.findAll();

    }

//    @PostMapping()
//    public String newEmployee()
//    {
//        return "Hi!!! from PostMapping";
//    }

    @PostMapping()
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity inputEmployee)
    {
        return employeeRepository.save(inputEmployee);
    }
}

