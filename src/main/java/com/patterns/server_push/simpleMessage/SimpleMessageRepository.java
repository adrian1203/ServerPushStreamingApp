package com.patterns.server_push.simpleMessage;

import history.HistoryRepository;
import notification.Notification;

import java.util.ArrayList;
import java.util.List;

public class SimpleMessageRepository implements HistoryRepository {

    private List<Notification> notifications = new ArrayList<>();
    @Override
    public void save(Notification notification) {
        notifications.add(notification);
    }

    @Override
    public List<Notification> getHistory() {
        return notifications;
    }
}
