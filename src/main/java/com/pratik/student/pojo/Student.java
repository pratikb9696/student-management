package com.pratik.student.pojo;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;


    private String name;
    private int rollNo;

    public Student() {
    }

    public Student(long studentId, String name, int rollNo) {
        this.studentId = studentId;
        this.name = name;
        this.rollNo = rollNo;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
