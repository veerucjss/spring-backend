package com.example.springbackend.controller;

import java.util.*;
import com.example.springbackend.model.Employee;
import com.example.springbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping
    public List<Employee> getAllEmployees() {

      return  employeeRepository.findAll();
    }


}


