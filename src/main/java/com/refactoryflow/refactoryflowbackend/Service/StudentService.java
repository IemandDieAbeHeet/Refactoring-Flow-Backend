package com.refactoryflow.refactoryflowbackend.Service;

import com.refactoryflow.refactoryflowbackend.Model.Student;
import com.refactoryflow.refactoryflowbackend.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public Optional<Student> findById(Long id){
        return studentRepository.findById(id);
    }

    public Student findStudentByEmailAndPassword(String email, String password) {
        return studentRepository.findStudentByEmailAndPassword(email, password);
    }
}
