package com.example.teacher_student.dairy.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@ToString
@Entity(name = "STUDENTS")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

   @Column(nullable = false)
    private String name;

   @Column(nullable = false)
    private String surname;

   @Column(nullable = false)
    private int age;

   @Column(nullable = false)
   private String email;

   @Column(nullable = false)
    private String subject;

    public StudentEntity(String name, String surname, int age, String email, String subject) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.subject = subject;
    }
}
