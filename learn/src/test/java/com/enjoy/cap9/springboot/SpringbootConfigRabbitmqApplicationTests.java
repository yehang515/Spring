package com.enjoy.cap9.springboot;

import com.enjoy.cap9.springboot.producer.MsgProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConfigRabbitmqApplicationTests {

    @Autowired
    private MsgProducer producer;

    @Test
    public void testRabbitMQ() throws Exception {
        producer.sendMsgA_A("111111");
        producer.sendMsgA_B("222222");
        producer.sendMsgB_B("333333");

    }
}
