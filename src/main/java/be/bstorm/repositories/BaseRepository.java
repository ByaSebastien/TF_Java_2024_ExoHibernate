package be.bstorm.repositories;

import be.bstorm.entities.BaseEntity;
import be.bstorm.entities.Pilot;

import java.util.List;

public interface BaseRepository<TEntity extends BaseEntity,TId> {

    Long save(TEntity entity);
    TEntity findById(TId id);
    List<TEntity> findAll();
    void delete(TId id);
    void update(TEntity entity);
}
