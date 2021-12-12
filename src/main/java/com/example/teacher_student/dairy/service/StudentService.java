package com.example.teacher_student.dairy.service;

import com.example.teacher_student.dairy.dto.UserDTO;
import com.example.teacher_student.dairy.entity.StudentEntity;
import com.example.teacher_student.dairy.form.UserForm;
import com.example.teacher_student.dairy.mapper.StudentMapper;
import com.example.teacher_student.dairy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<UserDTO> getStudents() {
        List<StudentEntity> students = studentRepository.findAll();
        return StudentMapper.map(students);
    }

    public UserDTO getStudent(Long id) {
        StudentEntity student = studentRepository.findAllById(id);
        return StudentMapper.map(student);
    }

    public UserDTO createStudent(UserForm form) {
        StudentEntity student = new StudentEntity()
                .setName(form.getName())
                .setSurname(form.getSurname())
                .setAge(form.getAge())
                .setEmail(form.getEmail())
                .setSubject(form.getSubject());

        StudentEntity entity = studentRepository.saveAndFlush(student);

        return StudentMapper.map(entity);
    }

    public UserDTO updateStudent(StudentEntity entity){
StudentEntity student = studentRepository.saveAndFlush(entity);
return StudentMapper.map(student);
    }

    public void deleteStudent(Long id){
studentRepository.deleteById(String.valueOf(id));
    }


}
