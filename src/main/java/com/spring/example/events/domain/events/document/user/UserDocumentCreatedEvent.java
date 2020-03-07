package com.spring.example.events.domain.events.document.user;

import com.spring.example.events.domain.events.document.DocumentCreatedEvent;
import com.spring.example.events.domain.models.UserDocument;

public class UserDocumentCreatedEvent extends DocumentCreatedEvent<UserDocument> {

    public UserDocumentCreatedEvent(UserDocument document) {
        super(document);
    }

}
