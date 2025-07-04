package com.example.studentmanagement.controller;
import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.StudentProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentProducer studentProducer;
    private final StudentRepository studentRepository;

    public StudentController(StudentProducer studentProducer, StudentRepository studentRepository) {
        this.studentProducer = studentProducer;
        this.studentRepository = studentRepository;
    }

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody Student student) throws JsonProcessingException {
        studentRepository.save(student); // save to DB
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(student);

        studentProducer.sendStudentAsync(json);

        return ResponseEntity.ok("Student created and event published");
    }
    @GetMapping
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
