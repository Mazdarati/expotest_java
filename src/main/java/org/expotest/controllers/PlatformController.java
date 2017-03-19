package org.expotest.controllers;

import org.expotest.models.Platform;
import org.expotest.services.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@RestController
@RequestMapping("/platform")
public class PlatformController {
    @Autowired
    private PlatformService platformService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Platform> getAllPlatforms() {
        return platformService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Platform savePlatform(Platform platform) {
        return platformService.save(platform);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlatform(Platform platform) {
        platformService.delete(platform);
    }

    @RequestMapping(value = "/{platformId}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Platform viewPlatform(@PathVariable long platformId) {
        return new Platform();
    }
}
