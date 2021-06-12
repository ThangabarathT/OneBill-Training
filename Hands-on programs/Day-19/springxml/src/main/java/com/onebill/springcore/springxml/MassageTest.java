package com.onebill.springcore.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.springcore.bean.Message;

public class MassageTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("MassegeConfig.xml");
		Message message = (Message) context.getBean("message");

		System.out.println(message.getMessage());
		
		((AbstractApplicationContext)context).close();
	}

}
