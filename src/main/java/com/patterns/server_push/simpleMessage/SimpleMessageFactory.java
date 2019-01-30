package com.patterns.server_push.simpleMessage;

import com.google.common.collect.ImmutableList;
import factory.AbstractServerStreamingConfigFactory;
import factory.HistoryRepository;

import java.util.List;

public class SimpleMessageFactory extends AbstractServerStreamingConfigFactory {

    @Override
    public HistoryRepository createHistoryRepository() {
        return new SimpleMessageRepository();
    } //todo trzeba wstzyknąc repo springowe

    @Override
    public List<String> createTriggerEndpoint() {
        return ImmutableList.of("/simple-message");
    }

    @Override
    public List<String> createDestinyEndpoints() {
        return ImmutableList.of("/topic/simple-message");
    }



}
