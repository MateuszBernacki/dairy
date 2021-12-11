package com.example.teacher_student.dairy.repository;

import com.example.teacher_student.dairy.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, String>, JpaSpecificationExecutor<TeacherEntity> {
    TeacherEntity findAllByNameAndUsername(String name, String surname);
}
