package com.staroot.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @RabbitListener(queues="test_q1")
    public void processMessage1(String content){
        System.out.println("Listener1:"+content);
    }
    @RabbitListener(queues="test_q2")
    public void processMessage2(String content){
        System.out.println("Listener2:"+content);
    }
    @RabbitListener(queues="test_q3")
    public void processMessage3(String content){
        System.out.println("Listener3:"+content);
    }
    
}
