package com.it.kafka.message;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: zhaowq
 * @since: 2018/7/6 15:01
 * @description:
 */
@Setter
@Getter
@Data
public class Message implements Serializable {
    private static final long serialVersionUID = -1L;

    private Long id;

    private String msg;

    private Date sendTime;
}
