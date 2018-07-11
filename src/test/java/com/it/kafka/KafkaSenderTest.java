package com.it.kafka;

import com.alibaba.fastjson.JSON;
import com.it.kafka.message.Message;
import com.it.kafka.receiver.KafkaReceiver;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/**
 * @author: zhaowq
 * @since: 2018/7/6 15:08
 * @description:
 */
public class KafkaSenderTest extends BaseTest {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Test
    public void send() throws Exception{
        KafkaReceiver.latch = new CountDownLatch(1);
        Message message = new Message();
        message.setId(System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());
        logger.info("message: {}", JSON.toJSONString(message));
        kafkaTemplate.send("test", "data", JSON.toJSONString(message));
        KafkaReceiver.latch.await();
    }
}
