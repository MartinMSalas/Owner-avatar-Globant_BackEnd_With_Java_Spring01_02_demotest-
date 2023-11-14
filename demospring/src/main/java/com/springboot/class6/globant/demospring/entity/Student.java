package com.springboot.class6.globant.demospring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
public class Student extends StudentAbstract {


    private String lastName;
    private String email;


    @Override
    public void run() {
        System.out.println("Student is running");
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
