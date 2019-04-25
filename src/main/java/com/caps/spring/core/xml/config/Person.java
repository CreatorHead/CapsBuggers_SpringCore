package com.caps.spring.core.xml.config;

import org.springframework.beans.factory.DisposableBean;

public class Person implements DisposableBean{
	private String name;
	private String email;
	private Job job;
	
	public void xyz() {
		System.out.println("init-method to do something");
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
	
	public void gettingDestroyed() {
		System.out.println("Bye Bye World");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroyed...");
	}
	
}
