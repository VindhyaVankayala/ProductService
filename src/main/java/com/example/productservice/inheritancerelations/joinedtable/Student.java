package com.example.productservice.inheritancerelations.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "j_student")
@PrimaryKeyJoinColumn(name="user_id")
public class Student extends User {
    private Double psp;
    private Double attendance;
    private Long year_of_passing;
    private String current_company;
}
