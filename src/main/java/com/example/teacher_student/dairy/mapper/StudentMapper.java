package com.example.teacher_student.dairy.mapper;

import com.example.teacher_student.dairy.dto.UserDTO;
import com.example.teacher_student.dairy.entity.StudentEntity;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMapper {

    public static UserDTO map(StudentEntity entity) {
        return new UserDTO()
                .setName(entity.getName())
                .setSurname(entity.getSurname())
                .setAge(entity.getAge())
                .setEmail(entity.getEmail())
                .setSubject(entity.getSubject());
    }

    public static List<UserDTO> map(List<StudentEntity> entities) {
        return entities.stream().map(StudentMapper::map).collect(Collectors.toList());
    }
}
