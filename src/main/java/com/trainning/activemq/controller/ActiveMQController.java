package com.trainning.activemq.controller;

import com.trainning.activemq.utils.ActiveMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActiveMQController {
    @Autowired
    ActiveMQProducer activeMQProducer;

    @RequestMapping("/message")
    public void sendMessage() {
        activeMQProducer.sendMessage("check my message " + Math.random());
    }
}
