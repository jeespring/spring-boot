package com.jeespring.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * KafkaListener
 *
 * @author 张朝阳
 * @date 2022/4/10 13:03:03
 */
@Component
public class KafkaTopicListener {

    @KafkaListener(topics = {"order-topic"})
    public void receiveMessage(String message){
        System.out.println(message);
    }
}
