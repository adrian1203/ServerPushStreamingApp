package com.patterns.server_push.repository;

import com.patterns.server_push.domain.SimpleMessage;
import factory.HistoryRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleMessageRepository  extends JpaRepository<SimpleMessage, Long> {
}
