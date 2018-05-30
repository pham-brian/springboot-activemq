package com.trainning.Springbootactivemq.utils;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQConsumer {
    @JmsListener(destination = "${active.topics}")
    public void receiveMessage(String message) {
        System.out.println("Receive message: " + message);
    }
}
