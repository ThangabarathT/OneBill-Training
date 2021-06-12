package com.onebill.springcore.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		// System.out.println( "Hello World!" );
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Vehile obj = (Vehile) context.getBean("bike");
		//obj.drive();
		
		Car car = context.getBean("car", Car.class);
		car.drive();

	}
}
