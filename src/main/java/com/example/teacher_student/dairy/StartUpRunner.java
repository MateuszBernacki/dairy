package com.example.teacher_student.dairy;

import com.example.teacher_student.dairy.entity.StudentEntity;
import com.example.teacher_student.dairy.entity.TeacherEntity;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Component
@Log
public class StartUpRunner implements CommandLineRunner {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        log.info("Executing  actions: ");

        StudentEntity student = new StudentEntity("student_1", "student1", 23, "adres@email.com", "Tourism");
        entityManager.persist(student);
        log.info("Student: " + student);

        TeacherEntity teacher = new TeacherEntity("teacher_1", "teacher1", 65, "asd@asd.pl", "English");
        entityManager.persist(teacher);
        log.info("Teacher: " + teacher);
    }
}
