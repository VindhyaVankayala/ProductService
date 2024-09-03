package com.example.productservice.inheritancerelations.joinedtable;

import com.example.productservice.inheritancerelations.mappedsuperclass.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("j_mentorrepository")
public interface MentorRepository extends JpaRepository<com.example.productservice.inheritancerelations.joinedtable.Mentor, Long> {

    Mentor save(Mentor mentor);
}
