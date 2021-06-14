package com.onebill.spring.spring_annotation_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.onebill.spring.bean.Car;
import com.onebill.spring.bean.Engine;
import com.onebill.spring.config.CarEngineConfig;

/**
 * Hello world!
 *
 */
public class CarEngineMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CarEngineConfig.class);
		Car hyundai = context.getBean(Car.class);
		Car maruti = context.getBean(Car.class);

		hyundai.setCname("Hyundai Creta");
		hyundai.setSpeed("190kmph");
		hyundai.setEngine(new Engine("1353 cc - 1497 cc"));
		

		maruti.setCname("Maruti XL6");
		maruti.setSpeed("170kmph");
		maruti.setEngine(new Engine("1300 cc - 1462 cc"));

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
