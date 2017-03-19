package org.expotest.repositories.JPA;

import org.expotest.models.Platform;
import org.expotest.repositories.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@Repository
public class PlatformRepositoryJPA extends AbstractRepositoryJPA<PlatformRepository,Platform> {
    @Autowired
    public PlatformRepositoryJPA(PlatformRepository entityRepo) {
        super(entityRepo);
    }

    @Override
    public Platform save(Platform platform) {
        //platform.validation();
        return entityRepo.save(platform);
    }
}
