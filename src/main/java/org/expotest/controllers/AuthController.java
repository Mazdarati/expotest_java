package org.expotest.controllers;

import org.expotest.models.User;
import org.expotest.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Mazdarati on 19.03.2017.
 */
@RestController
@RequestMapping(value = "/auth")
public class AuthController {
    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public User signup(@RequestBody User user) {
        return authenticationService.siginUser(user);
    }
}
