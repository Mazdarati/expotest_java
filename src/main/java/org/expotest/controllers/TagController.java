package org.expotest.controllers;

import org.expotest.models.Tag;
import org.expotest.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@RestController
@RequestMapping("tag")
public class TagController {
    @Autowired
    private TagService tagService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Tag> getAllTags() {
        return tagService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Tag saveTag() {
        return tagService.save(new Tag());
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTag(Tag tag) {
        tagService.delete(tag);
    }

    @RequestMapping(value = "/{tagId}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Tag viewTag(@PathVariable long tagId) {
        return new Tag();
    }
}
