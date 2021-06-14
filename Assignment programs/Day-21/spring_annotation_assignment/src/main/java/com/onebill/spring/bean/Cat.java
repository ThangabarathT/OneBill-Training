package com.onebill.spring.bean;

import org.springframework.stereotype.Component;



@Component
public class Cat implements Animal{
	
	@Override
	public void eat() {
		System.out.println("Cat is eating...");
		
	}

	@Override
	public void speak() {
		System.out.println("Meow meow...");
		
	}

}
