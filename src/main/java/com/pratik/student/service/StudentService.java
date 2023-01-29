package com.pratik.student.service;

import com.pratik.student.pojo.Student;

import java.util.List;

public interface StudentService {

    public void saveStudent(Student student);

    public Student getStudent(long studentId);

    public List<Student> getAllStudents();

    public Student getStudentByName(String name);
}
