package com.drk.batch.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BatchInitiator {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(BatchInitiator.class, args);
		
	}

}
