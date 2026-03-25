package com.example.studentdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean("studentAnnotation", Student.class);

        System.out.println("Annotation Config Output:");
        System.out.println(student);
    }
}
