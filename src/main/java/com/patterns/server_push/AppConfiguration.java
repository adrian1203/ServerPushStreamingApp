package com.patterns.server_push;

import com.google.common.collect.ImmutableList;
import com.patterns.server_push.simpleMessage.SimpleMessageFactory;
import config.AppConfig;
import config.BrokerConfiguration;
import config.EndpointService;
import core.NotificationHandler;
import core.SessionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

public class AppConfiguration {

    static AppConfig appConfig(){
        return AppConfig.createSingleton(8080,
                "/server-push",
                ImmutableList.of(
                        new EndpointService(new SimpleMessageFactory())
                ));
    }


}
