package com.onebill.spring.springannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.spring.bean.Employee;
import com.onebill.spring.config.AllConfig;

public class EmployeeTest2 {

	public static void main(String[] args) {
		
	ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
	Employee emp1 = context.getBean(Employee.class);
	System.out.println(emp1.getDepartment());
	System.out.println("Employee Name : "+emp1.getName());
	System.out.println("Employee Age : "+emp1.getAge());
	System.out.println("Department ID : "+emp1.getDepartment().getDeptid());
	System.out.println("Department Name : "+emp1.getDepartment().getDeptname());

	}

}
