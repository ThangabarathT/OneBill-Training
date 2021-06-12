package com.onebill.spring.springassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.Carxml;
import com.onebill.spring.bean.Enginexml;

public class CarxmlMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("CarxmlConfig.xml");
		Carxml hyundai = context.getBean("car", Carxml.class);
		Carxml maruti = context.getBean("car", Carxml.class);

		maruti.setCname("Maruti XL6");
		maruti.setSpeed("170kmph");
		maruti.setEngine(new Enginexml("1300 cc - 1462 cc"));

		System.out.println("---------Hyundai Creta---------");
		System.out.println("Car Name : " + hyundai.getCname());
		System.out.println("Speed    : " + hyundai.getSpeed());
		System.out.println("Capacity : " + hyundai.getEngine().getCapacity());

		System.out.println("\n---------Maruti XL6---------");
		System.out.println("Car Name : " + maruti.getCname());
		System.out.println("Speed    : " + maruti.getSpeed());
		System.out.println("Capacity : " + maruti.getEngine().getCapacity());

		((AbstractApplicationContext) context).close();
	}

}
