package com.caps.spring.core.xml.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/CarConfgi.xml");
		Car car = ctx.getBean(Car.class,"car");
		System.out.println(car);
		ctx.close();
	}
}
