package com.drk.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.job.SimpleJob;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobConfigurer {

	public Job springBatchJob(){
		return new SimpleJob("SpringBatchJob");
	}
}
