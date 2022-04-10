package com.jeespring.kafka.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * KafkaTopicController
 *
 * @author 张朝阳
 * @date 2022/4/10 13:02:02
 */

@RestController
@RequestMapping("/kafka")
public class KafkaTopicController {

    @Resource
    private KafkaTemplate<String,String> kafkaTemplate;

    @RequestMapping("/sendMessage")
    public void sendMessage(){
        String topic = "order-topic";
        kafkaTemplate.send(topic,"{orderId:1}");
    }
}
