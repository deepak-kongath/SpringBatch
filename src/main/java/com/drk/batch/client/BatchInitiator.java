package com.drk.batch.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BatchInitiator {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(BatchInitiator.class, args);
		
	}

}
