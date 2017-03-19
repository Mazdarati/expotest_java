package org.expotest.services;

import org.expotest.exceptions.AccessDeniedException;
import org.expotest.models.Tag;
import org.expotest.models.User;
import org.expotest.repositories.JPA.TagRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@Service
public class TagService {
    @Autowired
    private TagRepositoryJPA tagRepositoryJPA;
    @Autowired
    private SecurityService securityService;

    public Tag getById(long id) {
        return tagRepositoryJPA.findOne(id);
    }

    public Set<Tag> getTagsByName(String name) {
        return tagRepositoryJPA.getTagsByName(name);
    }

    public Tag save(Tag tag){
        final User currentUser = securityService.fetchCurrentUser();
        if(currentUser.getRole().equals("ROLE_EXP")) {
            throw new AccessDeniedException("You don't have access to this page.");
        }
        return tagRepositoryJPA.save(tag);
    }

    public Iterable<Tag> getAll() {
        return tagRepositoryJPA.findAll();
    }

    public void delete(Tag tag) {
        tagRepositoryJPA.delete(tag);
    }
}
