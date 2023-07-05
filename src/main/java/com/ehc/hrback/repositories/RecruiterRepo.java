package com.ehc.hrback.repositories;

import com.ehc.hrback.entites.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepo extends JpaRepository<Recruiter, Long> {
}
