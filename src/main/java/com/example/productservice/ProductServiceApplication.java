package com.example.productservice;

import com.example.productservice.inheritancerelations.mappedsuperclass.Mentor;
import com.example.productservice.inheritancerelations.mappedsuperclass.MentorRepository;
import com.example.productservice.inheritancerelations.mappedsuperclass.Student;
import com.example.productservice.inheritancerelations.mappedsuperclass.StudentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {
    private StudentRepository studentRepository;
    private MentorRepository mentorRepository;

    ProductServiceApplication(@Qualifier("ms_studentrepository") StudentRepository studentRepository, @Qualifier("ms_mentorrepository") MentorRepository mentorRepository) {
        this.studentRepository = studentRepository;
        this.mentorRepository = mentorRepository;
    }

    /*ProductServiceApplication(@Qualifier("ms_mentorrepository") MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }*/

    public static void main(String[] args) {

        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setName("Vindhya");
        student.setPsp(80.00);
        student.setAttendance(90.00);
        student.setCurrent_company("Amdocs");
        student.setYear_of_passing((long)2019);

        studentRepository.save(student);

        Mentor mentor = new Mentor();
        mentor.setName("Kshitij");
        mentor.setAvg_rating(4.5);
        mentor.setCurrent_company("Scaler");
        mentor.setYears_of_experience((long) 7);
        mentor.setTotal_no_of_mentees((long) 10);
        mentor.setTotal_sessions_taken((long) 100);
        mentor.setEmail_id("Kshitij@scaler.com");

        mentorRepository.save(mentor);

    }

}
