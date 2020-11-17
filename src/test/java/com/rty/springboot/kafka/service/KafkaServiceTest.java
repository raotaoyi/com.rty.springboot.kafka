package com.rty.springboot.kafka.service;

import com.rty.springboot.kafka.KafkaApplicationTest;
import com.rty.springboot.kafka.service.IKafkaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class KafkaServiceTest extends KafkaApplicationTest {
    @Autowired
    private IKafkaService kafkaService;
    @Test
    public void test(){
        kafkaService.sentMessage();
    }
}
