package com.ehc.hrback.repositories;

import com.ehc.hrback.entites.Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepo extends JpaRepository<Center, Long> {

}
