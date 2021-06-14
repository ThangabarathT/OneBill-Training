package com.onebill.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onebill.spring.bean.CustomerAware;

@Configuration
public class CustomerAwareConfig {

	@Bean
	public CustomerAware getCustomer() {
		return new CustomerAware();
	}
}
