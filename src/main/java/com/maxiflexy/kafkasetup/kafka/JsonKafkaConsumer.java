package com.maxiflexy.kafkasetup.kafka;

import com.maxiflexy.kafkasetup.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessage(User user){
        log.info("Json message received! :  {}", user.toString());
    }
}
