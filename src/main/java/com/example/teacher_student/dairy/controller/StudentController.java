package com.example.teacher_student.dairy.controller;

import com.example.teacher_student.dairy.entity.StudentEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String registerStudentForm(Model model) {
        StudentEntity student = new StudentEntity();
        model.addAttribute("student", student);

        return "indexStudent.html";
    }
}
