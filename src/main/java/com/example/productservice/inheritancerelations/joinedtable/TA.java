package com.example.productservice.inheritancerelations.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "j_ta")
@PrimaryKeyJoinColumn(name="user_id")
public class TA extends User {

    private Double avg_rating;
    private String university;
}
