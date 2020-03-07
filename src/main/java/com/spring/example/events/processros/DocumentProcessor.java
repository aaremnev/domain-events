package com.spring.example.events.processros;

import com.spring.example.events.domain.events.document.DocumentCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DocumentProcessor {

    @EventListener
    public void documentCreated(DocumentCreatedEvent<?> event) {
        log.debug("Generic processing of new document: {}", event.getDocument());
    }

}