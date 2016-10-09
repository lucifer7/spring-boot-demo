package com.yang.mq;

import lombok.extern.log4j.Log4j;

import java.util.concurrent.CountDownLatch;

/**
 * Usage: <b> Receiver for RabbitMQ </b>
 *
 * @author Jingyi.Yang
 *         Date 2016/10/9
 **/
@Log4j
public class Receiver {
    // Using countDownLatch to signal when message is received
    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String msg) {
        log.info("Receiving message from RabbitMQ: " + msg);
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
