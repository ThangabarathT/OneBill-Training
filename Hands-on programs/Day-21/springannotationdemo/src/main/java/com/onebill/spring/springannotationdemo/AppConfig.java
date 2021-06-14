package com.onebill.spring.springannotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages="com.onebill.spring.springannotationdemo")
@Configuration
public class AppConfig {

/*	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		return new SnapDragon();
	}*/
}
