package com.examly.springapp.repository;

import com.examly.springapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    
}
