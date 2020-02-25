package com.enjoy.cap9.springboot.controller;

import com.enjoy.cap9.springboot.producer.MsgProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("rabbit/")
public class RabbitController {

    @Resource
    private MsgProducer producer;

    @RequestMapping("send")
    public boolean rabbitSend(){
        producer.sendMsgA_A("1231221312211");

        return true;
    }
}
