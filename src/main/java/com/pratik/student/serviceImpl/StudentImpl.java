package com.pratik.student.serviceImpl;

import com.pratik.student.pojo.Student;
import com.pratik.student.repository.StudentRepo;
import com.pratik.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {


    @Autowired
    StudentRepo repo;
    @Override
    public void saveStudent(Student student) {
        repo.save(student);
    }

    @Override
    public Student getStudent(long studentId) {
        return repo.findById(studentId).orElse(new Student(1,"Demo",22));
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
