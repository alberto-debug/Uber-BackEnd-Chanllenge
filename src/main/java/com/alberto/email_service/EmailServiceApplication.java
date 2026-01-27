package com.alberto.email_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void home(){
		System.out.println("Application running at: http://localhost:8080");
	}


}
