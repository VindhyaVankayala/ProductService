package com.example.productservice.inheritancerelations.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_student")
@DiscriminatorValue(value = "2")
public class Student extends User {
    private Double psp;
    private Double attendance;
    private Long year_of_passing;
    private String current_company;
}