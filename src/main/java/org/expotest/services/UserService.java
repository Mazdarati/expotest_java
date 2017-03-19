package org.expotest.services;

import org.expotest.models.User;
import org.expotest.repositories.JPA.UserRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


/**
 * Created by Mazdarati on 12.03.2017.
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoryJPA userRepJPA;

    public User getById(Long id) {
        return userRepJPA.findOne(id);
    }

    public User getByLogin(String username) {
        return userRepJPA.getUserByLogin(username);
    }

    public User lock(User user) {
        return userRepJPA.lock(user);
    }

    public User save(User user){
        return userRepJPA.save(user);
    }

    public Iterable<User> getAll() {
        return userRepJPA.findAll();
    }

    public void delete(User user) {
        userRepJPA.delete(user);
    }
}
