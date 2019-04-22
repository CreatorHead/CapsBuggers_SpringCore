package com.caps.spring.core.xml.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/PersonConfig.xml");
		Person p = ctx.getBean(Person.class,"person");
		p.getJob().doJob();
	}
}
