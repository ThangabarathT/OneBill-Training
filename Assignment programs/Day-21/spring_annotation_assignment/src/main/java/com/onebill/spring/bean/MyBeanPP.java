package com.onebill.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPP implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("\nInside postProcessBeforeInitialization...");
		System.out.println("Bean : " + bean);
		System.out.println("Bean Name : " + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("\nInside postProcessAfterInitialization...");
		System.out.println("Bean : " + bean);
		System.out.println("Bean Name : " + beanName);
		return bean;
	}

}
