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
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.SimpMessagingTemplate;

@Configuration
public class ServerPushStreamingConfiguration {

    @Bean SimpMessagingTemplate simpMessagingTemplate(){
        return new SimpMessagingTemplate(new MessageChannel() {
            @Override
            public boolean send(Message<?> message, long l) {
                return false;
            }
        });
    }
    @Bean AppConfig appConfig(){
        return AppConfig.createSingleton(8080,
                "/server-push",
                ImmutableList.of(
                        new EndpointService(new SimpleMessageFactory())
                ));
    }

    @Bean
    public BrokerConfiguration brokerConfiguration(AppConfig appConfig, SimpMessagingTemplate template){
        return new BrokerConfiguration(appConfig, template);
    }

    @Bean
    public NotificationHandler notificationHandler(AppConfig appConfig, SimpMessagingTemplate template){
        return new NotificationHandler(appConfig,template);
    }
    @Bean
    public SessionHandler sessionHandler(){
        return new SessionHandler();
    }
}
