/* Example Program for Singleton and Prototype Bean Scopes in Java Spring
 * 
 *  Singleton: Only one instance will be created for a single bean definition per 
 *  Spring IoC container and the same object will be shared for each request made for 
 *  that bean.
 *  
 *  Prototype: A new instance will be created for a single bean definition every time a 
 *  request is made for that bean.
 *  
 */

package com.onebill.spring.springassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.Bike;

/**
 * Hello world!
 *
 */
public class BikeMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BikeConfig.xml");

		Bike honda = context.getBean("bike", Bike.class);
		honda.setBikename("Honda");
		honda.setSpeed(290);

		System.out.println("Bike Name : " + honda.getBikename());
		System.out.println("Speed : " + honda.getSpeed() + " Km/h");

		Bike suzuki = context.getBean("bike", Bike.class);
		suzuki.setBikename("Suzuki");
		suzuki.setSpeed(312);

		System.out.println("\nBike Name : " + suzuki.getBikename());
		System.out.println("Speed : " + suzuki.getSpeed() + " Km/h");

		System.out.println("\n-------Testing Both-------");
		
		System.out.println("\nBike Name : " + honda.getBikename());
		System.out.println("Speed : " + honda.getSpeed() + " Km/h");

		System.out.println("\nBike Name : " + suzuki.getBikename());
		System.out.println("Speed : " + suzuki.getSpeed() + " Km/h");
		
		((AbstractApplicationContext) context).close();
	}
}
