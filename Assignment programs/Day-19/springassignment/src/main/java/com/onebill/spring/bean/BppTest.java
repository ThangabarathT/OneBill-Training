package com.onebill.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BppTest implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("\nBean : "+bean);
		System.out.println("Bean Name : "+beanName);
		System.out.println("Inside postProcessBeforeInitialization...");
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("\nBean : "+bean);
		System.out.println("Bean Name : "+beanName);
		System.out.println("Inside postProcessBeforeInitialization...");
		return bean;
	}
	
}
