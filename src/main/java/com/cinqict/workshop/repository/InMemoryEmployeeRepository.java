package com.cinqict.workshop.repository;

import com.cinqict.workshop.domain.Employee;
import com.cinqict.workshop.repository.EmployeeRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class InMemoryEmployeeRepository implements EmployeeRepository {
    private final Map<String, Employee> employees = new HashMap<>();

    @Override
    public <S extends Employee> S save(final S entity) {
        employees.put(entity.getCompanyId(), entity);
        return entity;
    }

    @Override
    public Optional<Employee> findById(final String s) {
        return Optional.ofNullable(employees.get(s));
    }

    @Override
    public void deleteById(final String s) {
        employees.remove(s);
    }

    @Override
    public long count() {
        return employees.size();
    }

    @Override
    public <S extends Employee> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean existsById(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Employee> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Employee> findAllById(Iterable<String> strings) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Employee entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll(Iterable<? extends Employee> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();
    }
}
