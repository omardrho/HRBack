package com.ehc.hrback.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Recruiter {
    @Id
    @GeneratedValue(
            strategy = jakarta.persistence.GenerationType.IDENTITY
    )
    private long id;
    private String name;
    private String email;
    private String phone;

    @ManyToOne
    private Offer offer;
    @ManyToMany(mappedBy = "recruiters")
    private List<Center> centers;
}
