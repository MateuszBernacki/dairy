package com.example.teacher_student.dairy.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@ToString
@Entity(name = "Teacher")
public class TeacherEntity {


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
    private String specialization;

    public TeacherEntity(String name, String surname, int age, String email, String specialization) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public TeacherEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public TeacherEntity setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public TeacherEntity setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public TeacherEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSpecialization() {
        return specialization;
    }

    public TeacherEntity setSpecialization(String specialization) {
        this.specialization = specialization;
        return this;
    }
}
