package com.ehc.hrback.services;

import com.ehc.hrback.entites.Center;
import com.ehc.hrback.entites.Offer;

import java.util.List;

public interface IOfferService {
    List<Offer> getAllOffers();
    Offer addOffer(String title, String description, String city, String type,String language, String profileRequired, String socialAdvantage, Center center, Double salary);
    Offer updateOffer(Offer offer);

    void deleteOffer(Offer offer);
    List<Offer> getOfferbyCity(String city);
    List<Offer> getOfferbyCenter(Center center);
    List<Offer> getOfferbyType(String type);

}
