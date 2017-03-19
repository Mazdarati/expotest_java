package org.expotest.controllers;

import org.expotest.models.Offer;
import org.expotest.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Mazdarati on 14.03.2017.
 */
@RestController
@RequestMapping("/offer")
public class OfferController {
    @Autowired
    private OfferService offerService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Offer> getAllOffers() {
        return offerService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Offer saveOffer(Offer offer) {
        return offerService.save(offer);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOffer(Offer offer) {
        offerService.delete(offer);
    }

    @RequestMapping(value = "/{offerId}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Offer viewOffer(@PathVariable long offerId) {
        return new Offer();
    }
}
