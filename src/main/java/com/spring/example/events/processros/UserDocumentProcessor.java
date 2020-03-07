package com.spring.example.events.processros;

import com.spring.example.events.domain.events.document.user.UserDocumentCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserDocumentProcessor {

    @EventListener
    public void documentCreated(UserDocumentCreatedEvent event) {
        log.debug("Specific processing of new document: {}", event.getDocument());
    }

}
