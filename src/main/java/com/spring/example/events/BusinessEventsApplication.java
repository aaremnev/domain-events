package com.spring.example.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@EnableAsync
@EnableTransactionManagement
@SpringBootApplication
public class BusinessEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessEventsApplication.class, args);
	}

}
