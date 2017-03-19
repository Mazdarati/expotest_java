package org.expotest.services;

import org.expotest.exceptions.AccessDeniedException;
import org.expotest.models.Platform;
import org.expotest.models.User;
import org.expotest.repositories.JPA.PlatformRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@Service
public class PlatformService {
    @Autowired
    private PlatformRepositoryJPA platformRepositoryJPA;
    @Autowired
    private SecurityService securityService;

    public Platform getById(long id) {
        return platformRepositoryJPA.findOne(id);
    }

    public Platform save(Platform platform){
        final User currentUser = securityService.fetchCurrentUser();
        if(currentUser.getRole().equals("ROLE_EXP")) {
            throw new AccessDeniedException("You don't have access to this page.");
        }
        return platformRepositoryJPA.save(platform);
    }

    public Iterable<Platform> getAll() {
        return platformRepositoryJPA.findAll();
    }

    public void delete(Platform offer) {
        platformRepositoryJPA.delete(offer);
    }
}
