package com.example.studentmanagement.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StudentConsumer {
    @KafkaListener(topics = "student-topic", groupId = "student-group")
    public void listen(String studentJson) {
        System.out.println("Received async student event:"+ studentJson);
    }
}
