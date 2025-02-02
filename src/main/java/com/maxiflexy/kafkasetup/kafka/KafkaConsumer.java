package com.maxiflexy.kafkasetup.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    @KafkaListener(topics = "maxiflexy", groupId = "myGroup")
    public void consumeMessage(String message){
        log.info("Message received: {}", message);
    }
}
