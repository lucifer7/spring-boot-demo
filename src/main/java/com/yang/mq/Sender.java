package com.yang.mq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Usage: <b> </b>
 *
 * @author Jingyi.Yang
 *         Date 2016/10/10
 **/
public class Sender {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Scheduled(fixedDelay = 1000L)
    public void send() {
        this.rabbitTemplate.convertAndSend("spring-boot", "msg from sender.");
    }
}
