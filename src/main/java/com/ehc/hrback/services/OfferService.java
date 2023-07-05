package com.ehc.hrback.services;

import com.ehc.hrback.entites.Center;
import com.ehc.hrback.entites.Offer;
import com.ehc.hrback.repositories.OfferRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OfferService implements IOfferService{
    @Autowired
    OfferRepo or;

    @Override
    public List<Offer> getAllOffers() {
        List<Offer> offers = or.findAll();
        return offers;

    }

    @Override
    public Offer addOffer(String title, String description, String city, String type, String language, String profileRequired, String socialAdvantage, Center center, Double salary) {
        Offer offer = new Offer(
                null,
                title,
                description,
                type,
                null,
                profileRequired,
                socialAdvantage,
                salary,
                language,
                city,
                center,
                null
        );
            or.save(offer);
        return offer ;
    }

    @Override
    public Offer updateOffer(Offer offer) {
        or.save(offer);
        return offer;
    }

    @Override
    public void deleteOffer(Offer offer) {
        or.delete(offer);   }


    @Override
    public List<Offer> getOfferbyCity(String city) {
        return or.findByCity(city);
    }

    @Override
    public List<Offer> getOfferbyCenter(Center center) {
        return or.findByCenters(center);
    }

    @Override
    public List<Offer> getOfferbyType(String type) {
        return or.findByType(type);
    }





}
