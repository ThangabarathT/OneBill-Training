package com.onebill.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CustomerAware implements BeanNameAware, BeanFactoryAware, ApplicationContextAware{

	private String name;

	public CustomerAware() {
		super();
		System.out.println("Inside Default No-arg Constructor...");
	}

	public CustomerAware(String name) {
		super();
		this.name = name;
		System.out.println("Inside single arg Constructor...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomerAware [name=" + name + "]";
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("\nInside Application Context..."+arg0.getDisplayName());
		this.name = "Tony Stark";
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("\nInside Bean Factory Aware..."+beanFactory.containsBean("getCustomer"));
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("\nInside Bean Name Aware..."+name);
		
	}
}
