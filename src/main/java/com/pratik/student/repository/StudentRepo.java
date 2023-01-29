package com.pratik.student.repository;

import com.pratik.student.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {

    public Student findByName(String name);

}
