package com.onebill.springcore.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.springcore.bean.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CustomerConfig.xml");
		Customer customer = context.getBean("customer", Customer.class);
		System.out.println("First name is : "+customer.getFirstname());
	}

}
