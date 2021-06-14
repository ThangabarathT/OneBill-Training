package com.onebill.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog is eating...");
		
	}

	@Override
	public void speak() {
		System.out.println("Bow wow...");
		
	}

}
