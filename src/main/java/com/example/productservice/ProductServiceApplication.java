package com.example.productservice;

/*import com.example.productservice.inheritancerelations.mappedsuperclass.Mentor;
import com.example.productservice.inheritancerelations.mappedsuperclass.MentorRepository;
import com.example.productservice.inheritancerelations.mappedsuperclass.Student;
import com.example.productservice.inheritancerelations.mappedsuperclass.StudentRepository;*/
import com.example.productservice.inheritancerelations.tableperclass.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import javax.sound.midi.Soundbank;
import java.util.List;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {
    private StudentRepository studentRepository;
    private MentorRepository mentorRepository;

    private TaRepository taRepository;

    private UserRepository userRepository;

    ProductServiceApplication(@Qualifier("tpc_studentrepository") StudentRepository studentRepository, @Qualifier("tpc_mentorrepository") MentorRepository mentorRepository, UserRepository userRepository, TaRepository taRepository) {
        this.studentRepository = studentRepository;
        this.mentorRepository = mentorRepository;
        this.userRepository = userRepository;
        this.taRepository = taRepository;
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

        User user = new User();
        user.setName("Vindhya");
        user.setEmail_id("vindhya@hotmail.com");

        userRepository.save(user);

        Ta ta = new Ta();
        ta.setName("Manoj");
        ta.setAvg_rating(4.8);
        ta.setUniversity("DU");

        taRepository.save(ta);

        //Get all the users

        List<User> users = userRepository.findAll();
        for(User user1: users){
            System.out.println(user1.toString());
        }
    }

}
