package com.spring.example.events.domain.events.document;

import com.spring.example.events.domain.events.DomainEvent;
import com.spring.example.events.domain.models.Document;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@RequiredArgsConstructor
public class DocumentEvent<T extends Document> implements DomainEvent {

    @NotNull
    private final T document;

    @Override
    public String toString() {
        return document.toString();
    }

}
