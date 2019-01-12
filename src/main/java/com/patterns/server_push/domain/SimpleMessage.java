package com.patterns.server_push.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SimpleMessage {

    private String sender;
    private String receiver;
    private String text;
}
