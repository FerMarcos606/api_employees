package dev.fer.Api.implementations;

import java.util.List;

public interface InterfaceGenericaCRUDService<T, ID> {

    List<T> getEntities();

    T storeEntity(T entity);

    T showById(ID id);

    T updateEntity(ID id, T entity);

    void deleteEntity(ID id);
}
