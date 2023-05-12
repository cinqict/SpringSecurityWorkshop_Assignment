package com.cinqict.workshop.repository;

import com.cinqict.workshop.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
}
