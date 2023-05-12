package com.cinqict.workshop.controller;

import com.cinqict.workshop.domain.Employee;
import com.cinqict.workshop.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(final EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee create(@RequestBody final Employee employee) {
        return employeeService.create(employee);
    }

    @GetMapping("/{companyId}")
    public Employee retrieve(@PathVariable final String companyId) {
        return employeeService.retrieve(companyId)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "entity not found"));
    }

    @PatchMapping
    public Employee update(@RequestBody final Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping("/{companyId}")
    public void delete(@PathVariable final String companyId) {
        employeeService.delete(companyId);
    }
}
