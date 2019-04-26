package com.caps.spring.core.xml.config;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private String brand;
	
	@Autowired
	private Engine engine;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + "]";
	}
}
