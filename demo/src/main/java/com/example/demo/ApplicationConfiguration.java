package com.example.demo;

import org.springframework.context.annotation.Bean;

public class ApplicationConfiguration {
    @Bean
    StudentRepository studentRepository(){
        return new StudentRepository();
    }
}
