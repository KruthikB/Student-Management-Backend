package com.examly.springapp.service;

import com.examly.springapp.model.Student;
import com.examly.springapp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    
    private final StudentRepo studentRepo;
    
    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getById(Integer id) {
        return studentRepo.findById(id);
    }

    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    public void deleteStudentById(Integer id) {
        studentRepo.deleteById(id);
    }

    // Optionally, you can add a method to update a student
    public Student updateStudent(Integer id, Student studentDetails) {
        if (studentRepo.existsById(id)) {
            studentDetails.setId(id);
            return studentRepo.save(studentDetails);
        } else {
            return null;
        }
    }

    // Check if a student exists by ID
    public boolean existsById(Integer id) {
        return studentRepo.existsById(id);
    }
}
