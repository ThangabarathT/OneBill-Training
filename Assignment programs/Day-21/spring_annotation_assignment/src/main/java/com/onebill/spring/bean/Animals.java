package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Animals {
	
	@Autowired
	@Qualifier("dog")
	private Animal pet;

	public void pet() {
		System.out.println("Pet are living in my home");
		pet.eat();
		pet.speak();
	}
	
}
