package com.cinqict.workshop.service;

import com.cinqict.workshop.domain.Employee;
import com.cinqict.workshop.repository.EmployeeRepository;
import com.cinqict.workshop.service.implementation.CrudService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends CrudService<Employee, String> {

    public EmployeeService(@Qualifier("inMemoryEmployeeRepository") EmployeeRepository repository) {
        super(repository);
    }
}
