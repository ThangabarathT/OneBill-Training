package com.onebill.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onebill.spring.bean.Student;

@Configuration
public class StudentConfig {

	@Bean
	public Student getStudent() {
		return new Student();
	}
}
