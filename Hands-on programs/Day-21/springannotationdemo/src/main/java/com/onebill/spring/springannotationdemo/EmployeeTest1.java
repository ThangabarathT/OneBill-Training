package com.onebill.spring.springannotationdemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.spring.bean.Employee;
import com.onebill.spring.config.EmployeeConfig;

public class EmployeeTest1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp1 = context.getBean(Employee.class);
		Employee emp2 = context.getBean(Employee.class);
		//System.out.println(emp1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		emp1.setName(sc.nextLine());
		
		System.out.println("Enter Name : ");
		emp1.setAge(Integer.parseInt(sc.nextLine()));

		System.out.println("Enter Name : ");
		emp2.setName(sc.nextLine());
		
		System.out.println("Enter Name : ");
		emp2.setAge(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Name : "+emp1.getName());
		System.out.println("Age : "+emp1.getAge());
		
		System.out.println("*********************");
		
		System.out.println("Name : "+emp2.getName());
		System.out.println("Age : "+emp2.getAge());
	}

}
