package com.onebill.corejava.java8features;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationDemo {

	@Retention(RetentionPolicy.RUNTIME)
	public @interface Carsformul {
		Manufacturer[] value() default {};
	}

	@Manufacturer("Hyundai")
	@Manufacturer("Audi")
	@Manufacturer("Benz")
	@Manufacturer("Tata")
	public @interface car {
		String value();
	}

	@Repeatable(value = Carsformul.class)
	public @interface Manufacturer {
		String value();
	}

	public static void main(String[] args) {
		// Manufacturer[] arr =
		// Carsformul.class.getAnnotationsByType(Manufacturer.class);
		Carsformul cars = car.class.getAnnotation(Carsformul.class);

		for (Manufacturer m : cars.value()) {
			System.out.println(m.value());
		}
	}

}
