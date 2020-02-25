package com.enjoy.cap9.springboot.producer;


import com.enjoy.cap9.springboot.config.RabbitConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitConfig.QUEUE_B)
public class MsgReceiverB {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Bean
    public DirectExchange defaultExchange() {
        /**
         * DirectExchange:按照routingkey分发到指定队列
         * TopicExchange:多关键字匹配
         * FanoutExchange: 将消息分发到所有的绑定队列，无routingkey的概念
         * HeadersExchange ：通过添加属性key-value匹配
         */
        return new DirectExchange("bootExchange");
    }
    @RabbitHandler
    public void process(String content) {
        logger.info("接收处理队列B当中的消息： " + content);
    }


}
