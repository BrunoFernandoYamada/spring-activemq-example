package com.bfyamada.spring.activemq.demo.publisher;

import com.bfyamada.spring.activemq.demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AccountPublisher implements CommandLineRunner {

    @Autowired
    JmsTemplate jmsTemplate;

    @Override
    public void run(String... args) throws Exception {


        Account account = new Account();
        account.setId(UUID.randomUUID().toString());
        account.setNome("Finance Account");
        account.setStatus("OPENING");

        System.out.println("Enviando account por mensageria: " + account );
        jmsTemplate.convertAndSend("accounts", account);
        System.out.println("Mensagem enviada com sucesso!");

    }
}
