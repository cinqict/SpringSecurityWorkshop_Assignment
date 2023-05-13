package com.cinqict.workshop.repository.implementation;

import org.springframework.data.repository.CrudRepository;

import java.util.*;

public abstract class InMemoryRepository<T,ID> implements CrudRepository<T, ID> {

    private final Map<ID, T> map = new HashMap<>();

    protected abstract <S extends T> ID getId(S entity);

    @Override
    public <S extends T> S save(S entity) {
        map.put(getId(entity), entity);
        return entity;
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(map.get(id));
    }
    @Override
    public Iterable<T> findAll() {
        return map.values();
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }


    @Override
    public long count() {
        return map.size();
    }

    @Override
    public <S extends T> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean existsById(ID id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<T> findAllById(Iterable<ID> ids) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(T entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAllById(Iterable<? extends ID> ids) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll(Iterable<? extends T> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();
    }
}
