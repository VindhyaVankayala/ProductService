package com.example.productservice.inheritancerelations.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_mentor")
public class Mentor extends User {
    private Double avg_rating;
    private String current_company;
    private Long years_of_experience;
    private Long total_sessions_taken;
    private Long total_no_of_mentees;

}
