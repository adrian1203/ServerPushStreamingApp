package com.patterns.server_push.simpleMessage;

import com.google.common.collect.ImmutableList;
import factory.AbstractServerStreamingConfigFactory;
import factory.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimpleMessageFactory extends AbstractServerStreamingConfigFactory {

    final SimpleMessageRepositoryAdapter repository;

    @Autowired
    public SimpleMessageFactory(SimpleMessageRepositoryAdapter repository) {
        this.repository = repository;
    }

    @Override
    public HistoryRepository createHistoryRepository() {
        return repository;
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
