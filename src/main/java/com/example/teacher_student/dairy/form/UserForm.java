package com.example.teacher_student.dairy.form;

import javax.validation.constraints.*;

public class UserForm {

    @NotNull(message= "Not correct name")
    @Size(min = 2, message = "Name is to short")
    private String name;

    @NotNull(message= "Not correct name")
    @Size(min = 2, message = "Name is to short")
    private String surname;

    @Min(value = 18, message = "To young to fly now" )
    private int age;

    @Pattern(regexp = "^[A-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[A-Z0-9.-]+$",
    message = "Incorrect address email.")
    private String email;

    @NotNull(message= "Not correct subject")
    private String subject;

    @NotNull(message= "Not correct specialization")
    private String specialization;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public String getSpecialization() {
        return specialization;
    }
}
