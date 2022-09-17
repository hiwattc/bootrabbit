package com.staroot.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    RabbitMessagingTemplate template;

    @Bean
    Queue queue1(){
        return new Queue("test_q1",false);
    }
    @Bean
    Queue queue2(){
        return new Queue("test_q2",false);
    }
    @Bean
    Queue queue3(){
        return new Queue("test_q3",false);
    }

    public void send(String message){
        template.convertAndSend("test_q1", message);
        template.convertAndSend("test_q2", message);
        template.convertAndSend("test_q3", message);
    }
    
}
