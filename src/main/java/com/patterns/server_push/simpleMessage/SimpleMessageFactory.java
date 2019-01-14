package com.patterns.server_push.simpleMessage;

import com.google.common.collect.ImmutableList;
import factory.AbstractServerStreamingFactory;
import history.HistoryRepository;

import java.util.List;

public class SimpleMessageFactory extends AbstractServerStreamingFactory {
    @Override
    public HistoryRepository createHistoryRepository() {
        return null;
    }

    @Override
    public String createTriggerEndpoint() {
        return "/simple-message";
    }

    @Override
    public List<String> createSendToEndpoints() {
        return ImmutableList.of("/topic/simple-message");
    }
}
