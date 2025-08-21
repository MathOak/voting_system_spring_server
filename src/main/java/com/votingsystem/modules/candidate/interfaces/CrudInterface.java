package com.votingsystem.modules.candidate.interfaces;

import java.util.List;
import java.util.UUID;

public interface CrudInterface<T> {
    List<T> findAll();
    T findById(UUID id);
    void save(T entity);
    void update(UUID id, T entity);
    void delete(UUID id);
}
