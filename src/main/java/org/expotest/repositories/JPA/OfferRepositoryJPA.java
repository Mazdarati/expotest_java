package org.expotest.repositories.JPA;

import org.expotest.models.Offer;
import org.expotest.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@Repository
public class OfferRepositoryJPA extends AbstractRepositoryJPA<OfferRepository,Offer>{
    @Autowired
    public OfferRepositoryJPA(OfferRepository entityRepo) {
        super(entityRepo);
    }

    @Override
    public Offer save(Offer offer) {
        offer.validation();
        return entityRepo.save(offer);
    }

    public Set<Offer> getOffersByCreatorId(long userId){
        return entityRepo.findByCreatorId(userId);
    }

    public Set<Offer> getOffersByName(String name){
        return entityRepo.findByName(name);
    }
}
