package com.ehc.hrback.repositories;

import com.ehc.hrback.entites.Center;
import com.ehc.hrback.entites.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferRepo extends  JpaRepository<Offer, Long>{

   List<Offer> findByCenters(Center center);
   List<Offer> findByType(String type);

   List<Offer> findByCity(String city);
}

