package com.patterns.server_push.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import notification.Notification;

import java.util.Date;

@Getter
@Setter
@ToString
public class SimpleMessage implements Notification {

    private String sender;
    private String receiver;
    private String text;
    private Date date;
}
