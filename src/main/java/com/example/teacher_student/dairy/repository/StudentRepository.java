package com.example.teacher_student.dairy.repository;

import com.example.teacher_student.dairy.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, String>, JpaSpecificationExecutor<StudentEntity> {
StudentEntity findAllByNameAndUsername(String name, String surname);
}
