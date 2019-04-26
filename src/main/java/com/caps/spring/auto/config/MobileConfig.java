package com.caps.spring.auto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.caps.java.Job;

@Configuration
@ComponentScan
public class MobileConfig {
	
	@Bean @Primary
	public Sim getJio() {
		Jio sim = new Jio();
		sim.setImei(342545);
		sim.setNumber(43543634);
		sim.setType("VoLTE");
		return sim;
	}
	
	@Bean 
	public Sim getAirtel() {
		Airtel sim = new Airtel();
		sim.setImei(4346534);
		sim.setNumber(65464948);
		sim.setType("4G");
		return sim;
	}
}
