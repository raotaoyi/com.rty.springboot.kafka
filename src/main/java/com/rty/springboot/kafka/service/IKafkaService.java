package com.rty.springboot.kafka.service;

public interface IKafkaService {

    /**
     * @descroption 往kafka中发送消息，待后后续处理
     *
     */
    void sentMessage();

}