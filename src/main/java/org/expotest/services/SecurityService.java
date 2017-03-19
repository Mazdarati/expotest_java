package org.expotest.services;

import org.expotest.exceptions.AccessDeniedException;
import org.expotest.models.User;
import org.expotest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@Service
public class SecurityService {

    public User fetchCurrentUser() {
        return getCurrentUser(SecurityContextHolder.getContext().getAuthentication());
    }

    private User getCurrentUser(Authentication auth) {
        if (auth.getPrincipal().getClass() == String.class)
            throw new AccessDeniedException("User not logged in.");
        return (User) auth.getPrincipal();
    }

}
