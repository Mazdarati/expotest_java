package org.expotest.repositories;

import org.expotest.models.Offer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@Transactional
public interface OfferRepository extends CrudRepository<Offer, Long> {
    Set<Offer> findByCreatorId(long userId);
    Set<Offer> findByName(String name);
}
