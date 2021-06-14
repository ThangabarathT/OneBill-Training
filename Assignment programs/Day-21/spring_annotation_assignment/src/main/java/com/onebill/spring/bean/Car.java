package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

	private String cname;
	private String speed;
	
	@Autowired
	private Engine engine;
	
	public Car() {
		
	}
	
}
