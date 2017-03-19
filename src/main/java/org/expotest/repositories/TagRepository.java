package org.expotest.repositories;

import org.expotest.models.Tag;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Set;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@Transactional
public interface TagRepository extends CrudRepository<Tag, Long> {
    Set<Tag> findTagsByName(String tag);
}
