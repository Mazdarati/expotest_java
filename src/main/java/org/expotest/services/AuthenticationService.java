package org.expotest.services;

import org.expotest.exceptions.AccessDeniedException;
import org.expotest.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by Mazdarati on 19.03.2017.
 */
@Service
public class AuthenticationService {
    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    public User siginUser(User regUser) {

        User user = userService.getByLogin(regUser.getLogin());
        if(user != null)
            throw new UsernameNotFoundException("User already found.");
        if(regUser.getDisplayName() == null || regUser.getDisplayName().equals(""))
            throw new UsernameNotFoundException("Display name cannot be null");
        User newUser = new User();
        newUser.setLogin(regUser.getLogin());
        newUser.setDisplayName(regUser.getDisplayName());
        newUser.setPassword(passwordEncoder.encode(regUser.getPassword()));
        return userService.save(newUser);
    }
}
