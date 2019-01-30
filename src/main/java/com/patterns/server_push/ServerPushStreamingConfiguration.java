package com.patterns.server_push;


import com.google.common.collect.ImmutableList;
import com.patterns.server_push.simpleMessage.SimpleMessageFactory;
import config.AppConfig;
import config.BrokerConfiguration;
import config.EndpointService;
import core.NotificationHandler;
import core.SessionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;


@Configuration
public class ServerPushStreamingConfiguration extends BrokerConfiguration {

    @Lazy
    public ServerPushStreamingConfiguration(SimpMessagingTemplate template) {
        super(AppConfiguration.appConfig(), template);
    }

}
