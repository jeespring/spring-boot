package com.jeespring.kafka.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * KafkaListener
 *
 * @author 张朝阳
 * @date 2022/4/10 13:03:03
 */
@Slf4j
@Component
public class KafkaTopicListener {

    @KafkaListener(topics = {"order-topic"})
    public void receiveMessage(String message){
        log.info("接收到的消息：{}" , message);
    }
}
