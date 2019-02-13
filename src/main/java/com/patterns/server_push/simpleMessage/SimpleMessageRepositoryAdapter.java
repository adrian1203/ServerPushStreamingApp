package com.patterns.server_push.simpleMessage;


import com.patterns.server_push.domain.SimpleMessage;
import com.patterns.server_push.repository.SimpleMessageRepository;
import factory.HistoryRepository;
import factory.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleMessageRepositoryAdapter implements HistoryRepository {

    private final SimpleMessageRepository repository;

    @Autowired
    public SimpleMessageRepositoryAdapter(SimpleMessageRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Notification notification) {
        repository.save((SimpleMessage)notification);
    }

    @Override
    public List<Notification> getHistory() {
        return (List<Notification>)(List<?>)repository.findAll();
    }
}
