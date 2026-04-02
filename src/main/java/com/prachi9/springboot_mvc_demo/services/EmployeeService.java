package com.prachi9.springboot_mvc_demo.services;

import com.prachi9.springboot_mvc_demo.dto.EmployeeDTO;
import com.prachi9.springboot_mvc_demo.entities.EmployeeEntity;
import com.prachi9.springboot_mvc_demo.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService (EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository=employeeRepository;
        this.modelMapper = modelMapper;
    }
    public EmployeeDTO getEmployeeByID(Long id) {
       EmployeeEntity employeeEntity=employeeRepository.findById(id).orElse(null);
       return modelMapper.map(employeeEntity, EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees() {
         List<EmployeeEntity> employeeEntities= employeeRepository.findAll();
         return employeeEntities
                 .stream()
                 .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTO.class))
                 .collect(Collectors.toList());
    }

    public EmployeeDTO createEmployee(EmployeeDTO inputEmployee){
        EmployeeEntity toSaveEmployee= modelMapper.map(inputEmployee, EmployeeEntity.class);
        EmployeeEntity savedEmployee= employeeRepository.save(toSaveEmployee);
        return modelMapper.map(savedEmployee, EmployeeDTO.class);
    }
}
