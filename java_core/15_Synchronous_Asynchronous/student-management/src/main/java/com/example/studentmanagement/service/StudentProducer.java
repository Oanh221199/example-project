package com.example.studentmanagement.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public StudentProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendStudentAsync(String studentJson) {
        kafkaTemplate.send("student-topic", studentJson);
    }
}
