package org.expotest.repositories.JPA;

import org.expotest.models.User;
import org.expotest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Mazdarati on 12.03.2017.
 */
@Repository
public class UserRepositoryJPA extends AbstractRepositoryJPA<UserRepository,User>{

    @Autowired
    public UserRepositoryJPA(UserRepository entityRepo) {
        super(entityRepo);
    }

    @Override
    public User save(User user) {
        user.validation();
        return entityRepo.save(user);
    }

    public User getUserByLogin(String login){
        return entityRepo.findUserByLogin(login);
    }

    public User lock(User user) {
        if(!user.isEnabled())
            user.setLock(true);
        else
            throw new IllegalArgumentException("Error. User was locked.");
        return entityRepo.save(user);
    }
}
