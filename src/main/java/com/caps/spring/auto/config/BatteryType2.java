package com.caps.spring.auto.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class BatteryType2 implements Battery {
	private double price = 2000.43;
	private int capacity = 5000;
	
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
		return "BatteryType2 [price=" + price + ", capacity=" + capacity + "]";
	}
}
