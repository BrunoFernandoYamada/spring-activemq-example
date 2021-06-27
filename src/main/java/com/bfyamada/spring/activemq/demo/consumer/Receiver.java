package com.bfyamada.spring.activemq.demo.consumer;

import com.bfyamada.spring.activemq.demo.model.Account;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination="accounts")
    public void messageCosumer(Account accont){
        System.out.println("Account received: " + accont);
    }


}
