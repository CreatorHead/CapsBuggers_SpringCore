package com.caps.spring.core.java.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(PersonConfig.class);
		Person p = ctx.getBean(Person.class);
		int count = ctx.getBeanDefinitionCount();
		System.out.println("No. of Beans: "+ count);
		String[] beans = ctx.getBeanDefinitionNames();
		for(String bean:beans) {
			System.out.println(bean);
		}
		p.getJob().doJob();
		ctx.close();
	}
}
