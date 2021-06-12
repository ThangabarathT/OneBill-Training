package com.onebill.springcore.springxml;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.springcore.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
		Employee emp1 = (Employee) context.getBean("employee");
		Employee emp2 = (Employee) context.getBean("employee");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : " );
		emp1.setName(sc.nextLine());
		
		System.out.println("Enter Age : " );
		emp1.setAge(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter name : " );
		emp2.setName(sc.nextLine());
		
		System.out.println("Enter Age : " );
		emp2.setAge(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Name : "+emp1.getName());
		System.out.println("Age : "+emp1.getAge());
		
		System.out.println("Name : "+emp2.getName());
		System.out.println("Age : "+emp2.getAge());
		
	}

}
