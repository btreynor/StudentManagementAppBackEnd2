package com.treynorcodes.studentmanagementbackend.service;

import com.treynorcodes.studentmanagementbackend.model.Student;
import com.treynorcodes.studentmanagementbackend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class StudentService implements StudentServiceInterface {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public Student updateStudent(int id, Student student) {
        Student studentToUpdate = studentRepository.findById(id).orElseThrow();
        studentToUpdate.setFirstName(student.getFirstName());
        studentToUpdate.setLastName(student.getLastName());
        studentToUpdate.setEmailId(student.getEmailId());
        studentToUpdate.setStudentIdNo(student.getStudentIdNo());
        return studentRepository.save(studentToUpdate);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
