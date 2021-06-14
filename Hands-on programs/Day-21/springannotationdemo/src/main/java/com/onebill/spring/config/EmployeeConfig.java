package com.onebill.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.onebill.spring.bean.Employee;

@Configuration
public class EmployeeConfig {

//	@Bean
//	public Employee getEmployee() {
//		Employee bean = new Employee();
//		bean.setAge(22);
//		bean.setName("Tony");
//		return bean;
//	}
	
	@Bean
	@Scope(scopeName="prototype")
	public Employee getEmployee() {
		return new Employee();
	}
}
