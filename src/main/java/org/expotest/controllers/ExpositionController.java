package org.expotest.controllers;

import org.expotest.models.Exposition;
import org.expotest.models.User;
import org.expotest.services.ExpositionService;
import org.expotest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by Mazdarati on 13.03.2017.
 */
@RestController
@RequestMapping("/exposition")
public class ExpositionController {

    @Autowired
    private ExpositionService expositionService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Exposition> getAllExpositions() {
        return expositionService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Exposition saveExposition(@RequestBody Exposition exposition) {
        return expositionService.save(exposition);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteExposition(@RequestBody Exposition exposition) {
        expositionService.delete(exposition);
    }

    @RequestMapping(value = "/view/{expositionId}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Exposition viewExposition(@PathVariable Long expositionId) {
        return expositionService.getById(expositionId);
    }

    @RequestMapping(value = "/view/me",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Set<Exposition> viewExpositionByUser() {
        return expositionService.getExpositionByUser();
    }

}
