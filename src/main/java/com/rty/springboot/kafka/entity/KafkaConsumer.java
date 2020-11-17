package com.rty.springboot.kafka.entity;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

   @KafkaListener(topics = "test01")
    public void userListener(ConsumerRecord<?,?> record){
        System.out.println(record.topic());
        System.out.println(record.offset());
        System.out.println(record.value());
    }

}
