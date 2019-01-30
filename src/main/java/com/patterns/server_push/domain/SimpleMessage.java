package com.patterns.server_push.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import factory.Notification;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
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
    @JsonIgnore
    private Long id;

    @Column(name = "sender")
    @Size(max = 50)
    private String sender;

    @Column(name = "receiver")
    @Size(max = 50)
    private String receiver;

    @Column(name = "text")
    @Size(max = 500)
    private String text;

    @Column(name = "date")
    private Date date;
}
