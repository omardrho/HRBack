package com.ehc.hrback.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Offer {
    @Id
    @GeneratedValue(
            strategy = jakarta.persistence.GenerationType.IDENTITY
    )
    private Long id;
    private String title;
    private String description;
    private String type;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String profileRequired;
    private String socialAdvantage;
    private Double salary;
    private String language;
    private String city;

    @PrePersist
    protected void onCreate() {
        date = new Date();
    }

    @ManyToOne
    private Center centers;
    @OneToMany(mappedBy = "offer")
    private List<Recruiter> recruiters;
}
