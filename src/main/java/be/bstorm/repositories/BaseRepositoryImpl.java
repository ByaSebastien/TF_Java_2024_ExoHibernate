package be.bstorm.repositories;

import be.bstorm.entities.BaseEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;

import java.util.List;

public abstract class BaseRepositoryImpl<TEntity extends BaseEntity,TId> implements BaseRepository<TEntity,TId> {

    private final EntityManagerFactory emf;
    private final Class<TEntity> entityClass;

    public BaseRepositoryImpl(Class<TEntity> entityClass) {
        this.entityClass = entityClass;
        this.emf = Persistence.createEntityManagerFactory("ExoJPA");
    }

    @Override
    public Long save(TEntity entity) {
        try (EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            return entity.getId();
        }
    }

    @Override
    public TEntity findById(TId tId) {
        try (EntityManager em = emf.createEntityManager()){
            TEntity entity = em.find(this.entityClass,tId);
            if(entity == null){
                throw new EntityNotFoundException(tId.toString());
            }
            return entity;
        }
    }

    @Override
    public List<TEntity> findAll() {
        try (EntityManager em = emf.createEntityManager()){
            return em.createQuery("SELECT e FROM "+this.entityClass.getSimpleName()+" e").getResultList();
        }
    }

    @Override
    public void delete(TId tId) {
        try (EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            TEntity entity = em.find(this.entityClass,tId);
            if(entity == null){
                throw new EntityNotFoundException(tId.toString());
            }
            em.remove(entity);
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(TEntity entity) {
        try (EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            TEntity entity1 = em.find(this.entityClass,entity.getId());
            if(entity1 == null){
                throw new EntityNotFoundException(entity.getId().toString() + " not found");
            }
            em.merge(entity);
            em.getTransaction().commit();
        }
    }

//    public abstract Class<TEntity> getEntityClass();
}
