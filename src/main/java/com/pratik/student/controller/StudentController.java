package com.pratik.student.controller;

import com.pratik.student.pojo.Student;
import com.pratik.student.serviceImpl.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class StudentController {

    @Autowired
    StudentImpl studentImpl;
    @PostMapping("/add")
    public ResponseEntity<Void> saveStudent(@RequestBody Student student){
        studentImpl.saveStudent(student);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable long id){
        Student student=studentImpl.getStudent(id);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> allStudents=studentImpl.getAllStudents();
        return new ResponseEntity<>(allStudents,HttpStatus.OK);
    }

    @GetMapping("/getStudent/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String name){
        Student student=studentImpl.getStudentByName(name);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }
}
