package com.trainning.activemq.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${active.topics}")
    private String destination;

    public void sendMessage(String message) {
        System.out.println("Send message: " + message);
        jmsTemplate.convertAndSend(destination, message);
    }
}
