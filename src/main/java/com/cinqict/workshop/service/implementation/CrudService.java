package com.cinqict.workshop.service.implementation;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


public class CrudService<T, ID> {

    private final CrudRepository<T, ID> repository;

    public CrudService(final CrudRepository<T, ID> repository) {
        this.repository = repository;
    }

    public <S extends T> T create(final S entity) {
        return repository.save(entity);
    }

    public Optional<T> retrieve(final ID id) {
        return repository.findById(id);
    }

    public List<T> retrieveAll() {
        final var results =  repository.findAll();
        return StreamSupport.stream(results.spliterator(), false)
                .collect(Collectors.toList());
    }

    public T update(final T entity) {
        return repository.save(entity);
    }

    public void delete(final ID id) {
        repository.deleteById(id);
    }
}
