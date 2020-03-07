package com.spring.example.events.domain.events.document;

import com.spring.example.events.domain.models.Document;

import javax.validation.constraints.NotNull;

public class DocumentUpdatedEvent<T extends Document> extends DocumentEvent<T> {

    public DocumentUpdatedEvent(@NotNull T document) {
        super(document);
    }

}
