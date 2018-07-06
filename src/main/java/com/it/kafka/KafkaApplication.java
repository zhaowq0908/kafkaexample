package com.it.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: zhaowq
 * @since: 2018/7/6 15:06
 * @description:
 */
@SpringBootApplication
@ComponentScan("com.it.kafka")
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }
}
