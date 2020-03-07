package com.spring.example.events.domain.events.document;

import com.spring.example.events.domain.models.Document;

import javax.validation.constraints.NotNull;

public class DocumentDeletedEvent<T extends Document> extends DocumentEvent<T> {

    public DocumentDeletedEvent(@NotNull T document) {
        super(document);
    }

}
