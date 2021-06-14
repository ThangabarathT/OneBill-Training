package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private String name;
	private int age;
	
	@Autowired(required=true)
	//@Qualifier("hr")
	private Department department;
	
	public Employee() {
		super();
	}
}
