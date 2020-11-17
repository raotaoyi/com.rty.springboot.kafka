package com.rty.springboot.kafka.entity;

import com.alibaba.fastjson.JSON;
import com.rty.springboot.kafka.bean.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class KafkaProducer {
    private static Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    //发送消息方法
    public void send() {
        for (int i = 0; i < 5; i++) {
            Message message = new Message();
            message.setId(UUID.randomUUID().toString());
            message.setMsg("---" + i);
            message.setSendTime(String.valueOf(System.currentTimeMillis()));
            logger.info("发送消息 ----->>>>>  message = {}", JSON.toJSONString(message));
            kafkaTemplate.send("test01", JSON.toJSONString(message));
        }
    }

}

