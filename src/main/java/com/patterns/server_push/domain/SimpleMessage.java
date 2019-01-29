package com.patterns.server_push.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import notification.Notification;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "simple_message")
public class SimpleMessage implements Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "sender")
    private String sender;

    @Column(name = "receiver")
    private String receiver;

    @Column(name = "text")
    private String text;

    @Column(name = "date")
    private Date date;
}
