package com.patterns.server_push.repository;

import com.patterns.server_push.domain.SimpleMessage;
import factory.HistoryRepository;
import factory.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleMessageRepositorySpring extends JpaRepository<SimpleMessage, Long> {
}
