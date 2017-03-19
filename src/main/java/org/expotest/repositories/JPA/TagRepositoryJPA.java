package org.expotest.repositories.JPA;

import org.expotest.models.Tag;
import org.expotest.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@Repository
public class TagRepositoryJPA extends AbstractRepositoryJPA<TagRepository,Tag>{
    @Autowired
    public TagRepositoryJPA(TagRepository entityRepo) {
        super(entityRepo);
    }

    @Override
    public Tag save(Tag tag) {
        //tag.validation();
        return entityRepo.save(tag);
    }

    public Set <Tag> getTagsByName(String name){
        return entityRepo.findTagsByName(name);
    }

}
