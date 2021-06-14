package com.onebill.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onebill.spring.bean.Engine;

@Configuration
public class EngineConfig {

	@Bean
	public Engine getEngine() {
		return new Engine();
	}
}
