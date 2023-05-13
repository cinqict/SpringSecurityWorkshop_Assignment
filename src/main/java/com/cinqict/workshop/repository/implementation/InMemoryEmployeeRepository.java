package com.cinqict.workshop.repository.implementation;

import com.cinqict.workshop.domain.Employee;
import com.cinqict.workshop.repository.EmployeeRepository;
import org.springframework.stereotype.Component;

@Component
public class InMemoryEmployeeRepository extends InMemoryRepository<Employee, String> implements EmployeeRepository {

    @Override
    protected <S extends Employee> String getId(S entity) {
        return entity.getCompanyId();
    }
}
