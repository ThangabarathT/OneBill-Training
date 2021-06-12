package com.onebill.springcore.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.springcore.bean.Employee;

public class EmployeeTest2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ImportAll.xml");
		Employee emp = context.getBean("employee", Employee.class);
		
		System.out.println("Employee Name : "+emp.getName());
		System.out.println("Employee Age : "+emp.getAge());
		System.out.println("Department ID : "+emp.getDepartment().getDeptid());
		System.out.println("Department Name : "+emp.getDepartment().getDeptname());

	
	}

}
