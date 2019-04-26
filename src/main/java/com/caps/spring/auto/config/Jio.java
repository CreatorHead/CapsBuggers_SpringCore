package com.caps.spring.auto.config;

import org.springframework.context.annotation.Primary;


public class Jio implements Sim{
	private int imei;
	private long number;
	private String type;
	@Override
	public String toString() {
		return "Jio [imei=" + imei + ", number=" + number + ", type=" + type + "]";
	}
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
