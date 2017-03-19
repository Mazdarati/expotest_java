package org.expotest.services;

import org.expotest.models.Offer;
import org.expotest.repositories.JPA.OfferRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@Service
public class OfferService {
    @Autowired
    private OfferRepositoryJPA offerRepositoryJPA;

    public Offer getById(long userId) {
        return offerRepositoryJPA.findOne(userId);
    }

    public Set<Offer> getOffersByName(String name) {
        return offerRepositoryJPA.getOffersByName(name);
    }

    public Set<Offer> getOffersByCreatorId(long userId) {
        return offerRepositoryJPA.getOffersByCreatorId(userId);
    }

    public Offer save(Offer offer){
        return offerRepositoryJPA.save(offer);
    }

    public Iterable<Offer> getAll() {
        return offerRepositoryJPA.findAll();
    }

    public void delete(Offer offer) {
        offerRepositoryJPA.delete(offer);
    }
}
