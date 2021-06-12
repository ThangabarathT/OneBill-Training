package com.onebill.spring.springassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.BeanPostProcessorBean;

public class BeanPostProcessorMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("BPPConfig.xml");
		BeanPostProcessorBean bpp = context.getBean("bpp", BeanPostProcessorBean.class);
		
		bpp.setName("Tony Stark");
		bpp.setAge(22);
		
		System.out.println("Name : "+bpp.getName());
		System.out.println("Age  : "+bpp.getAge());
		
		((AbstractApplicationContext)context).close();
	}

}
