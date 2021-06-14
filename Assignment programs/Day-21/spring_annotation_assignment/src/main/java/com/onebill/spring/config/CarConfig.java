package com.onebill.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.onebill.spring.bean.Car;

@Configuration
public class CarConfig {

	@Bean
	@Scope(scopeName="prototype")
	public Car getCarDetails() {
		return new Car();
	}
	
}
