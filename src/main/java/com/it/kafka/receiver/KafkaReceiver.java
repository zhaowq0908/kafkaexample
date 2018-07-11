package com.it.kafka.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;


/**
 * @author: zhaowq
 * @since: 2018/7/6 15:05
 * @description:
 */
@Component
@Slf4j
@KafkaListener(topics = {"test"})
public class KafkaReceiver {

    public static CountDownLatch latch;

    @KafkaHandler
    public void onMessage(String message) {
        log.info("receiver message:{}", message);
        if (latch != null) {
            latch.countDown();
        }
    }
}
