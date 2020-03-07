package com.spring.example.events.domain.events;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
@RequiredArgsConstructor
public class DomainEventLogger {

    private final ApplicationContext context;

    @EventListener
    public void logEvent(DomainEvent event) {
        log.info("DomainEvent {}: {}",
                event.getClass().getSimpleName(),
                event.toString()
        );
    }

}
