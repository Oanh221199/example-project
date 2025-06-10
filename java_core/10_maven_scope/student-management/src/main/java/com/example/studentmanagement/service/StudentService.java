package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return  studentRepository.findAll();
    }

    public  Student createStudent(Student student){
        return  studentRepository.save(student);
    }

    public Optional<Student> getStudent(Long id){
        return  studentRepository.findById(id);
    }

    public  Student updateStudent(Long id, Student updatedStudent){
        Optional<Student> student = getStudent(id);
        if (student.isPresent()) {
            Student existingStudent = student.get();

            existingStudent.setName(updatedStudent.getName());
            existingStudent.setAge(updatedStudent.getAge());

            return studentRepository.save(existingStudent);
        } else {
            throw new EntityNotFoundException("Student with ID " + id + " not found.");
        }
    }
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
