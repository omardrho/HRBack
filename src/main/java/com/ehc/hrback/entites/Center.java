package com.ehc.hrback.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.util.List;


@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Center {
    @Id
    @GeneratedValue(
            strategy = jakarta.persistence.GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    private String presentation;
    private String feed;


    @OneToMany(mappedBy = "centers")
    private List<Offer> offers;
    @ManyToMany
    private List<Recruiter> recruiters;

}
