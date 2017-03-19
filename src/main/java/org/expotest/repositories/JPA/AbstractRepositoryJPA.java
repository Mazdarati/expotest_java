package org.expotest.repositories.JPA;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Mazdarati on 12.03.2017.
 */
public abstract class AbstractRepositoryJPA <R extends CrudRepository<G, Long>, G> {
    protected R entityRepo;

    public AbstractRepositoryJPA(R entityRepo) {
        this.entityRepo = entityRepo;
    }

    public G save(G entity) {
        return entityRepo.save(entity);
    }

    public Iterable<G> save(Iterable<G> entities) {
        return entityRepo.save(entities);
    }

    
    public G findOne(Long aLong) {
        return entityRepo.findOne(aLong);
    }

    
    public boolean exists(Long aLong) {
        return entityRepo.exists(aLong);
    }

    
    public Iterable<G> findAll() {
        return entityRepo.findAll();
    }

    
    public Iterable<G> findAll(Iterable<Long> longs) {
        return entityRepo.findAll(longs);
    }

    
    public long count() {
        return entityRepo.count();
    }

    
    public void delete(Long aLong) {
        entityRepo.delete(aLong);
    }

    
    public void delete(G entity) {
        entityRepo.delete(entity);
    }

    
    public void delete(Iterable<? extends G> entities) {
        entityRepo.delete(entities);
    }

    
    public void deleteAll() {
        entityRepo.deleteAll();
    }
}
