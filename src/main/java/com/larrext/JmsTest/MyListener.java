package com.larrext.JmsTest;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

    @JmsListener(destination = "${springJMS.myQueue}")
    public void receive(String message){

        System.out.println("Message received ---> "+message);

    }

}
