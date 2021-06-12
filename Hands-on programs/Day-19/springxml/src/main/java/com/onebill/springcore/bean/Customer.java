package com.onebill.springcore.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Customer implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	private String firstname;

	public Customer() {
		System.out.println("Default no-arg Constructor");
	}

	public Customer(String firstname) {
		System.out.println("Single-arg Constructor");
		this.firstname = firstname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("Inside Application Context..... " + arg0.isSingleton("customer"));
		this.firstname = "Steve";

	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("Inside setBeanFactory...." + arg0.containsBean("xyz"));

	}

	public void setBeanName(String arg0) {
		System.out.println("Inside setBeanName....");

	}

}
