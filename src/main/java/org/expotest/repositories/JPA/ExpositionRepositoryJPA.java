package org.expotest.repositories.JPA;

import org.expotest.models.Exposition;
import org.expotest.repositories.ExpositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by Mazdarati on 12.03.2017.
 */
@Repository
public class ExpositionRepositoryJPA extends AbstractRepositoryJPA<ExpositionRepository,Exposition> {
    @Autowired
    public ExpositionRepositoryJPA(ExpositionRepository entityRepo) {
        super(entityRepo);
    }

    public Set<Exposition> findExpositionsByCreatorUserId(long id) {
        return entityRepo.findExpositionsByCreatorUserId(id);
    }

    @Override
    public Exposition save(Exposition exposition) {
        exposition.validation();
        return entityRepo.save(exposition);
    }
}
