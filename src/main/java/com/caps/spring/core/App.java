package com.caps.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(PersonConfig.class);
		Person p = ctx.getBean(Person.class,"person");
		p.getJob().doJob();
	}
}
