package com.onebill.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BfppTest implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory bfpp) throws BeansException {
		System.out.println(bfpp);
		System.out.println("\nInside BeanFactoryPostProcessor....\n");
	}

}
