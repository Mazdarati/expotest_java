package org.expotest.repositories;

import org.expotest.models.Exposition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by Mazdarati on 12.03.2017.
 */
@Transactional
public interface ExpositionRepository extends CrudRepository<Exposition,Long> {
    Set<Exposition> findExpositionsByCreatorUserId(long id);
}
