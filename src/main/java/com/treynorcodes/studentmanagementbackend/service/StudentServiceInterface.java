package com.treynorcodes.studentmanagementbackend.service;

import com.treynorcodes.studentmanagementbackend.model.Student;

import java.util.List;
import java.util.Optional;


public interface StudentServiceInterface {
    public Student saveStudent(Student student);
    public Optional<Student> getStudentById(int id);
    List<Student> getAllStudents();
    Student updateStudent(int id, Student student);
    void deleteStudent(int id);
}
