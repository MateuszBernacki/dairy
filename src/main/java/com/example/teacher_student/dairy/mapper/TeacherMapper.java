package com.example.teacher_student.dairy.mapper;

import com.example.teacher_student.dairy.dto.UserDTO;
import com.example.teacher_student.dairy.entity.TeacherEntity;

import java.util.List;
import java.util.stream.Collectors;

public class TeacherMapper {

    public static UserDTO map(TeacherEntity entity) {
        return new UserDTO()
                .setName(entity.getName())
                .setSurname(entity.getSurname())
                .setAge(entity.getAge())
                .setEmail(entity.getEmail())
                .setSpecialization(entity.getSpecialization());
    }

    public static List<UserDTO> map(List<TeacherEntity> entities) {
        return entities.stream().map(TeacherMapper::map)
                .collect(Collectors.toList());
    }
}
