package com.example.productservice.inheritancerelations.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_student")
public class Student extends User{
    private Double psp;
    private Double attendance;
    private Long year_of_passing;
    private String current_company;
}
