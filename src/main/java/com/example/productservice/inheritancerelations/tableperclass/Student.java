package com.example.productservice.inheritancerelations.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_student")
public class Student extends User {
    private Double psp;
    private Double attendance;
    private Long year_of_passing;
    private String current_company;
}
