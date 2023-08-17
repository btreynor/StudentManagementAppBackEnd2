package com.treynorcodes.studentmanagementbackend.repository;

import com.treynorcodes.studentmanagementbackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
