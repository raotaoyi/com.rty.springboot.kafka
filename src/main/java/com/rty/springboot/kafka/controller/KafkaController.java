package com.rty.springboot.kafka.controller;

import com.rty.springboot.kafka.bean.ResultInfo;
import com.rty.springboot.kafka.service.IKafkaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private static Logger logger= LoggerFactory.getLogger(KafkaController.class);
    @Autowired
    private IKafkaService kafkaService;
    @RequestMapping(value = "/kafka/send/message",method = RequestMethod.GET)
    public ResultInfo<?> postMessage(){
        ResultInfo resultInfo=new ResultInfo();
        try{
            kafkaService.sentMessage();
            resultInfo.setMessage("send message success");
            resultInfo.setStatus(0);
            return resultInfo;
        }catch (Exception e){
            logger.info("send message fail",e);
            resultInfo.setMessage("send message fail");
            resultInfo.setStatus(1);
            return resultInfo;
        }
    }

}
