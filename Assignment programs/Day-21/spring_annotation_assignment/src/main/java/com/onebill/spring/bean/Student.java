package com.onebill.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

	private String name;
	private int age;
	
	public Student() {
		super();
		System.out.println("Inside Default No-arg Constructor...\n");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method...\n");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("\nInside Destroy method...\n");
	}
}
