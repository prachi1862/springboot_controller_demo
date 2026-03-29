package com.prachi9.springboot_mvc_demo.controller;

import Repositories.EmployeeRepository;
import com.prachi9.springboot_mvc_demo.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

//    @GetMapping(path = "/getsecretmsg")
//    public String getSecretMsg() {
//        return "Secret Message: gygsuise";
//    }

    @GetMapping("/{employeeID}")
    public EmployeeDTO getEmployeebyID (@PathVariable(name="employeeID") Long id)
    {
        return new EmployeeDTO(id, "Prachi Mehra", "prachiiii@gmail.com", 21, LocalDate.of(2004, 5, 18), true);
    }
    @GetMapping()
    public String getEmployeeAge(@RequestParam(required = false, name="inputAge") int age)
    {
        return "HI!!! age: " + age;
    }

//    @PostMapping()
//    public String newEmployee()
//    {
//        return "Hi!!! from PostMapping";
//    }

    @PostMapping()
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO inputEmployee)
    {
        inputEmployee.setId(69);
        return inputEmployee;
    }
}

