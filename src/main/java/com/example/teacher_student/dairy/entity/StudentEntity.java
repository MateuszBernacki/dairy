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

    public String getName() {
        return name;
    }

    public StudentEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public StudentEntity setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentEntity setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StudentEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public StudentEntity setSubject(String subject) {
        this.subject = subject;
        return this;
    }
}
