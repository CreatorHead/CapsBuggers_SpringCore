package com.caps.spring.auto.config;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
@Named
public class Mobile {
	
	private int mobileId = 1234;
	private String model = "S10";
	private String brand = "Samsung";
	
	//@Autowired
	@Inject
	@Qualifier("getAirtel")
	private Sim sim;
	
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	@Autowired @Qualifier("batteryType1")
	private Battery battery;
	
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", model=" + model + ", brand=" + brand + ", sim=" + sim + ", battery="
				+ battery + "]";
	}
	
}
