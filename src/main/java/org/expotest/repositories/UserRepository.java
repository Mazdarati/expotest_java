package org.expotest.repositories;

import org.expotest.models.Exposition;
import org.expotest.models.User;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
import java.util.Set;

/**
 * Created by Mazdarati on 12.03.2017.
 */
@Transactional
public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByLogin(String login);
}
