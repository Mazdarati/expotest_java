package org.expotest.controllers;

import org.expotest.config.security.UserDetailsService;
import org.expotest.models.User;
import org.expotest.services.AuthenticationService;
import org.expotest.services.SecurityService;
import org.expotest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Mazdarati on 13.03.2017.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Iterable<User> getAllUsers() {
        return userService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@RequestBody User user) {
        userService.delete(user);
    }

    @RequestMapping(value = "/lock", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public User lockUser(@RequestBody User User) {
       return userService.lock(User);
    }

    @RequestMapping(value = "/me", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public User viewUser() {
        return securityService.fetchCurrentUser();
    }

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public User signup(@RequestBody User user) {
        return authenticationService.siginUser(user);
    }

}
