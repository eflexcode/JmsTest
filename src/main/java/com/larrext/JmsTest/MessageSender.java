package com.larrext.JmsTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${springJMS.myQueue}")
    private String queue;

    public void sendMessage(String message){
        jmsTemplate.convertAndSend(queue,message);
    }
}
