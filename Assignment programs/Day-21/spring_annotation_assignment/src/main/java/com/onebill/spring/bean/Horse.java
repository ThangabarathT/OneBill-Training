package com.onebill.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Horse implements Animal{

	@Override
	public void eat() {
		System.out.println("Horse is eating...");
		
	}

	@Override
	public void speak() {
		System.out.println("Neigh neigh...");
	}

}
