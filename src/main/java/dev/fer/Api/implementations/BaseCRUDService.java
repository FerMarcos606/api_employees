package dev.fer.Api.implementations;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public abstract class BaseCRUDService<T, ID> implements InterfaceGenericaCRUDService<T, ID> {

    protected abstract JpaRepository<T, ID> getRepository();

    @Override
    public List<T> getEntities() {
        return getRepository().findAll();
    }

    @Override
    public T storeEntity(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public T showById(ID id) {
        return getRepository().findById(id).orElse(null);
    }

    @Override
    public T updateEntity(ID id, T entity) {
        if (getRepository().existsById(id)) {
            return getRepository().save(entity);
        }
        return null;
    }

    @Override
    public void deleteEntity(ID id) {
        getRepository().deleteById(id);
    }
}

