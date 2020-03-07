package com.spring.example.events.domain.events.document;

import com.spring.example.events.domain.models.Document;

public class DocumentCreatedEvent<T extends Document> extends DocumentEvent<T> {

    public DocumentCreatedEvent(T document) {
        super(document);
    }

}
