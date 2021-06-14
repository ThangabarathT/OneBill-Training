package com.onebill.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.onebill.spring.bean.Employee;

//@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig2 {

	@Bean
	public Employee getEmployee() {
		Employee bean = new Employee();
		bean.setAge(22);
		bean.setName("Tony");
		return bean;
	}

}
