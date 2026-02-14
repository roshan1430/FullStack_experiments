package com.example.springcore;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id;
    private String name;
    private String dateOfCompletion;

    public Certification() {
        this.id = 101;
        this.name = "Spring Core";
        this.dateOfCompletion = "14-02-2026";
    }

    @Override
    public String toString() {
        return "Certification{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfCompletion='" + dateOfCompletion + '\'' +
                '}';
    }
}
