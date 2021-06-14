package com.onebill.spring.spring_annotation_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.onebill.spring.bean.Animals;
import com.onebill.spring.config.AllConfig;

public class AnimalMain {
	
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Animals pet = context.getBean(Animals.class);
		pet.pet();
		
		((AbstractApplicationContext) context).close();
	}
	
}
