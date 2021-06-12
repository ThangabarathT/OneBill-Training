package com.onebill.spring.springassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.BeanFactoryPostProcessorBean;

public class BeanFactoryPostProcessorMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BFPPConfig.xml");
		BeanFactoryPostProcessorBean bfpp = context.getBean("bfpp", BeanFactoryPostProcessorBean.class);

		bfpp.setName("Tony Stark");
		bfpp.setAge(22);

		System.out.println("Name : " + bfpp.getName());
		System.out.println("Age  : " + bfpp.getAge());

		((AbstractApplicationContext) context).close();
	}

}
