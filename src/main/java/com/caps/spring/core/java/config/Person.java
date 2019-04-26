package com.caps.spring.core.java.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
	private String name;
	private String email;
	private Job job;
	
	@PostConstruct //init codes
	public void abc() {
			System.out.println("Person is ready to work");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@PreDestroy
	public void gettingKilled() {
		System.out.println("Bye Bye World");
	}
}
