package com.example.teacher_student.dairy.dto;

public class UserDTO {

    private String name;
    private String surname;
    private int age;
    private String email;
    private String subject;
    private String specialization;

    public String getName() {
        return name;
    }

    public UserDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserDTO setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserDTO setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public UserDTO setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getSpecialization() {
        return specialization;
    }

    public UserDTO setSpecialization(String specialization) {
        this.specialization = specialization;
        return this;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
