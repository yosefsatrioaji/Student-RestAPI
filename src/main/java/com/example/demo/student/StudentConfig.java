package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student(
                "John",
                "john@gmail.com",
                LocalDate.of(1990, Month.JANUARY, 1)
            );
            Student jane = new Student(
                "Jane",
                "jane@gmail.com",
                LocalDate.of(1999, Month.FEBRUARY, 2));
            Student yosef = new Student(
                "Yosef",
                "yosef@gmail.com",
                LocalDate.of(2001, Month.MAY, 26));

                studentRepository.saveAll(List.of(john, jane, yosef));
        };

    }
}
