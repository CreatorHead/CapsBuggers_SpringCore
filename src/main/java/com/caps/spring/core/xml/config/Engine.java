package com.caps.spring.core.xml.config;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String model="Snapdragon";
	private String type="Rocket Fuel";
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Engine [model=" + model + ", type=" + type + "]";
	}
}
