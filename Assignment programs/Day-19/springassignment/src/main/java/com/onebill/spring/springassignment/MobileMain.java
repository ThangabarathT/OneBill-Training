package com.onebill.spring.springassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.Charge;
import com.onebill.spring.bean.Mobile;

public class MobileMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Mobile.xml");
		Mobile mobile = context.getBean("mobile", Mobile.class);
		mobile.connect();
	}
}
