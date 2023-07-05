package com.ehc.hrback.controllers;

import com.ehc.hrback.entites.Center;
import com.ehc.hrback.entites.Offer;
import com.ehc.hrback.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class OfferController {
     @Autowired
     OfferService os;

     @GetMapping("/offers")
    public List<Offer> getAll(){
         return os.getAllOffers();
     }
     @PostMapping("/add/offer")
    public Offer addOffer(String title, String description, String city, String type, String language, String profileRequired, String socialAdvantage, Center center, Double salary) {
        return os.addOffer(
                title,
                description,
                city,
                type,
                language,
                profileRequired,
                socialAdvantage,
                center,
                salary
        );


    }


}
