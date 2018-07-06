package com.it.kafka.message;

import lombok.Data;
import lombok.Setter;

import java.util.Date;

/**
 * @author: zhaowq
 * @since: 2018/7/6 15:01
 * @description:
 */
@Data
@Setter
public class Message {
    private Long id;    //id

    private String msg; //消息

    private Date sendTime;  //时间戳
}
