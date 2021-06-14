package com.onebill.spring.spring_annotation_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.onebill.spring.bean.CustomerAware;
import com.onebill.spring.config.CustomerAwareConfig;

public class CustomerAwareMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerAwareConfig.class);
		CustomerAware customer = context.getBean(CustomerAware.class);
		System.out.println("\nCustomer Name : "+customer.getName());
		
		((AbstractApplicationContext) context).close();

	}

}
