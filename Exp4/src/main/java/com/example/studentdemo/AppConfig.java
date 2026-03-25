package com.example.studentdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student studentAnnotation() {
        return new Student(102, "Rahul", "Information Technology", 2);
    }
}
