package com.example.teacher_student.dairy.controller;

import com.example.teacher_student.dairy.entity.TeacherEntity;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {

    @GetMapping("/teacher")
    public String registerTeacherForm (Model model){

        TeacherEntity teacher = new TeacherEntity();
        model.addAttribute("teacher", teacher);
        return "indexTeacher.html";
    }
}
