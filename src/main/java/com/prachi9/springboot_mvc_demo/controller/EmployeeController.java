package com.prachi9.springboot_mvc_demo.controller;

import com.prachi9.springboot_mvc_demo.services.EmployeeService;
import org.springframework.web.bind.annotation.*;
import com.prachi9.springboot_mvc_demo.dto.EmployeeDTO;
import java.util.List;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

private final EmployeeService employeeService;

public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
}

    @GetMapping("/{employeeID}")
    public EmployeeDTO getEmployeeByID (@PathVariable(name="employeeID") Long id)
    {
        return employeeService.getEmployeeByID(id);
    }
    @GetMapping()
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false) Integer age)
    {
        return employeeService.getAllEmployees();

    }

    @PostMapping()
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO inputEmployee)
    {
        return employeeService.createEmployee(inputEmployee);
    }
}

