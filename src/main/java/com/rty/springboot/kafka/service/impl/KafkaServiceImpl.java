package com.rty.springboot.kafka.service.impl;

import com.rty.springboot.kafka.entity.KafkaProducer;
import com.rty.springboot.kafka.service.IKafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KafkaServiceImpl implements IKafkaService {
    @Autowired
    private KafkaProducer kafkaProducer;

    @Override
    public void sentMessage() {
        kafkaProducer.send();
    }


}
