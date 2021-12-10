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
}
