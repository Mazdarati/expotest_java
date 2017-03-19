package org.expotest.services;

import org.expotest.config.security.UserDetailsService;
import org.expotest.exceptions.AccessDeniedException;
import org.expotest.repositories.JPA.ExpositionRepositoryJPA;
import org.expotest.models.User;
import org.expotest.models.Exposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

/**
 * Created by Mazdarati on 12.03.2017.
 */
@Service
public class ExpositionService {

    @Autowired
    ExpositionRepositoryJPA expRepJpa;

    @Autowired
    SecurityService securityService;

    @Autowired
    UserService userService;

    public Exposition getById(long id) {
        return expRepJpa.findOne(id);
    }

    public Exposition save(Exposition exposition){
        exposition.setCreatorUser(securityService.fetchCurrentUser());
        return expRepJpa.save(exposition);
    }

    public Iterable<Exposition> getAll() {
        return expRepJpa.findAll();
    }

    public void delete(Exposition exposition) {
        expRepJpa.delete(exposition);
    }

    public Set<Exposition> getExpositionByUser() {
        return expRepJpa.findExpositionsByCreatorUserId(securityService.fetchCurrentUser().getId());
    }

    public static String getString() {
        return "Test";
    }

}
