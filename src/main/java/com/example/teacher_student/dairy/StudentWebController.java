package com.example.teacher_student.dairy;

import com.example.teacher_student.dairy.dto.UserDTO;
import com.example.teacher_student.dairy.form.UserForm;
import com.example.teacher_student.dairy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
public class StudentWebController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String getHome() {
        return "indexHome.html";
    }

    @GetMapping("/menuStudent")
    public String getMenu() {
        return "menuStudent.html";
    }

    @RequestMapping(value = "/student", method = { RequestMethod.GET, RequestMethod.POST })
    public String createUser(@RequestBody(required = false) @Valid UserForm form, Model model) {
        UserDTO studentAdd = service.createStudent(form);
        model.addAttribute("studentAdd", studentAdd);
        return "redirect: menuStudent.html";
    }


}
