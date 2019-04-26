package com.caps.spring.core.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	
	@Bean(name="person")
	public Person getPerson() {
		Person p = new Person();
		p.setName("Bhargava");
		p.setEmail("bhargava@gmail.com");
		p.setJob(getJob());
		return p;
	}
	
	@Bean(name="tester")
	public Job getJob() {
		return new SoftwareTester();
	}
	
	
	
	
}
