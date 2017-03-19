package org.expotest.repositories;

import org.expotest.models.Platform;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@Transactional
public interface PlatformRepository extends CrudRepository<Platform, Long> {
}
