package com.example.teacher_student.dairy.service;

import com.example.teacher_student.dairy.dto.UserDTO;
import com.example.teacher_student.dairy.entity.TeacherEntity;
import com.example.teacher_student.dairy.form.UserForm;
import com.example.teacher_student.dairy.mapper.TeacherMapper;
import com.example.teacher_student.dairy.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<UserDTO> getTeacher() {
        List<TeacherEntity> teacher = teacherRepository.findAll();
        return TeacherMapper.map(teacher);

    }

    public UserDTO getTeacher(Long id) {
        TeacherEntity teacher = teacherRepository.findAllById(id);

        return TeacherMapper.map(teacher);
    }

    public UserDTO createTeacher(UserForm form) {

        TeacherEntity teacher = new TeacherEntity()
                .setName(form.getName())
                .setSurname(form.getSurname())
                .setAge(form.getAge())
                .setEmail(form.getEmail())
                .setSpecialization(form.getSpecialization());

        TeacherEntity entity = teacherRepository.saveAndFlush(teacher);

        return TeacherMapper.map(entity);
    }

    public UserDTO updateTeacher(TeacherEntity entity){
        TeacherEntity teacher = teacherRepository.saveAndFlush(entity);

        return TeacherMapper.map(teacher);

    }

    public void deleteTeacher(Long id){
        teacherRepository.deleteById(String.valueOf(id));
    }
}
