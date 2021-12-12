package com.example.teacher_student.dairy;

import com.example.teacher_student.dairy.entity.TeacherEntity;
import com.example.teacher_student.dairy.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherWebController {

    @Autowired
    private TeacherService service;

    @GetMapping("/teacher")
    public String registerTeacherForm (Model model){

        TeacherEntity teacher = new TeacherEntity();
        model.addAttribute("teacher", teacher);
        return "indexTeacher.html";
    }
}
