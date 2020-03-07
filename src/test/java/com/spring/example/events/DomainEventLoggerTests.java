package com.spring.example.events;

import com.spring.example.events.domain.events.DomainEventBus;
import com.spring.example.events.domain.events.DomainEventLogger;
import com.spring.example.events.domain.events.document.DocumentCreatedEvent;
import com.spring.example.events.domain.events.document.user.UserDocumentCreatedEvent;
import com.spring.example.events.domain.models.Document;
import com.spring.example.events.domain.models.UserDocument;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DomainEventLoggerTests {

	@Autowired DomainEventBus domainEventBus;
	@Autowired DomainEventLogger eventLogger;

	@Test
	void documentCreated() {
		Document document = new Document("test");
		DocumentCreatedEvent<Document> event = new DocumentCreatedEvent<>(document);

		domainEventBus.publish(event);
	}

	@Test
	void userDocumentCreated() {
		UserDocument document = new UserDocument("user test");
		UserDocumentCreatedEvent event = new UserDocumentCreatedEvent(document);

		domainEventBus.publish(event);
	}

}
