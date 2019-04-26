package com.caps.spring.auto.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class BatteryType1 implements Battery {
	private double price = 1500.43;
	private int capacity = 4500;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "BatteryType1 [price=" + price + ", capacity=" + capacity + "]";
	}
}
