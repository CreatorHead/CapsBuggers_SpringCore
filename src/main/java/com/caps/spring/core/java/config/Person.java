package com.caps.spring.core.java.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements BeanNameAware, BeanFactoryAware,
	ApplicationContextAware, BeanPostProcessor, InitializingBean,
	DisposableBean{
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
	@Override
	public void setBeanName(String name) {
		System.out.println("My name is " +name);
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("I am in BeanFactory by name: "+beanFactory);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("I am in ApplicationCtx by name: "+applicationContext);
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before Post Process");
		return null;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After Post Process");
		return null;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Properties are set");
	}

	@PreDestroy
	public void gettingKilled() {
		System.out.println("Bye Bye World");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("bean destroyed");
	}
}
