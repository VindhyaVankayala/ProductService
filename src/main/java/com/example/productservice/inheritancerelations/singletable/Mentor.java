package com.example.productservice.inheritancerelations.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_mentor")
@DiscriminatorValue(value = "1")
public class Mentor extends User {
    private Double avg_rating;
    private String current_company;
    private Long years_of_experience;
    private Long total_sessions_taken;
    private Long total_no_of_mentees;

}
