package com.example.productservice;

/*import com.example.productservice.inheritancerelations.mappedsuperclass.Mentor;
import com.example.productservice.inheritancerelations.mappedsuperclass.MentorRepository;
import com.example.productservice.inheritancerelations.mappedsuperclass.Student;
import com.example.productservice.inheritancerelations.mappedsuperclass.StudentRepository;*/
//import com.example.productservice.inheritancerelations.tableperclass.*;
import com.example.productservice.inheritancerelations.joinedtable.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import javax.sound.midi.Soundbank;
import java.util.List;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {
    //private StudentRepository studentRepository;
    //private MentorRepository mentorRepository;

    //private TaRepository taRepository;

    private UserRepository userRepository;

    private com.example.productservice.inheritancerelations.joinedtable.UserRepository j_userrepository;
    private com.example.productservice.inheritancerelations.joinedtable.StudentRepository j_studentrepository;

    private com.example.productservice.inheritancerelations.joinedtable.MentorRepository j_mentorrepository;

    ProductServiceApplication(@Qualifier("j_userrepository") com.example.productservice.inheritancerelations.joinedtable.UserRepository j_userrepository,
                              @Qualifier("j_studentrepository") com.example.productservice.inheritancerelations.joinedtable.StudentRepository j_studentrepository,
                              @Qualifier("j_mentorrepository") com.example.productservice.inheritancerelations.joinedtable.MentorRepository j_mentorrepository) {
        //this.studentRepository = studentRepository;
        //this.mentorRepository = mentorRepository;
        //this.userRepository = userRepository;
        //this.taRepository = taRepository;
        this.j_userrepository = j_userrepository;
        this.j_mentorrepository = j_mentorrepository;
        this.j_studentrepository = j_studentrepository;
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

        //studentRepository.save(student);
        j_studentrepository.save(student);
        Mentor mentor = new Mentor();
        mentor.setName("Kshitij");
        mentor.setAvg_rating(4.5);
        mentor.setCurrent_company("Scaler");
        mentor.setYears_of_experience((long) 7);
        mentor.setTotal_no_of_mentees((long) 10);
        mentor.setTotal_sessions_taken((long) 100);
        mentor.setEmail_id("Kshitij@scaler.com");

        //mentorRepository.save(mentor);
        j_mentorrepository.save(mentor);
        User user = new User();
        user.setName("Vindhya");
        user.setEmail_id("vindhya@hotmail.com");

        //userRepository.save(user);
        j_userrepository.save(user);
        /*Ta ta = new Ta();
        ta.setName("Manoj");
        ta.setAvg_rating(4.8);
        ta.setUniversity("DU");

        taRepository.save(ta);*/

        //Get all the users

        /*List<User> users = userRepository.findAll();
        for(User user1: users){
            System.out.println(user1.toString());
        }*/


    }

}
