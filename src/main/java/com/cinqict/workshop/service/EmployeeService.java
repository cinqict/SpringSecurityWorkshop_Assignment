package com.cinqict.workshop.service;

import com.cinqict.workshop.domain.Employee;
import com.cinqict.workshop.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(final EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee create(final Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> retrieve(final String companyId) {
        return employeeRepository.findById(companyId);
    }

    public Employee update(final Employee employee) {
        return employeeRepository.save(employee);
    }

    public void delete(final String companyId) {
        employeeRepository.deleteById(companyId);
    }
}
