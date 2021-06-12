package com.onebill.spring.springassignment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.onebill.spring.bean.Bike;

public class BeanFactoryDemo {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("BikeConfig.xml");
		BeanFactory bean = new XmlBeanFactory(res);
		
		Bike honda = bean.getBean("bike", Bike.class);
		honda.setBikename("Honda");
		honda.setSpeed(290);

		System.out.println("Bike Name : " + honda.getBikename());
		System.out.println("Speed : " + honda.getSpeed() + " Km/h");

		Bike suzuki = bean.getBean("bike", Bike.class);
		suzuki.setBikename("Suzuki");
		suzuki.setSpeed(312);

		System.out.println("\nBike Name : " + suzuki.getBikename());
		System.out.println("Speed : " + suzuki.getSpeed() + " Km/h");

		System.out.println("\n-------Testing Both-------");
		
		System.out.println("\nBike Name : " + honda.getBikename());
		System.out.println("Speed : " + honda.getSpeed() + " Km/h");

		System.out.println("\nBike Name : " + suzuki.getBikename());
		System.out.println("Speed : " + suzuki.getSpeed() + " Km/h");
		
	}

}
