package com.caps.spring.auto.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
		 	= new AnnotationConfigApplicationContext(MobileConfig.class);
		Mobile mobile = ctx.getBean(Mobile.class,"mobile");
		System.out.println(mobile);
		ctx.close();
	}
}
