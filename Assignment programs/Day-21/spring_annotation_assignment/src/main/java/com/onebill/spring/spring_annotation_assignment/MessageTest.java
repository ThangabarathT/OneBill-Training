package com.onebill.spring.spring_annotation_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.onebill.spring.bean.MessageBean;
import com.onebill.spring.config.MessageConfig;

public class MessageTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean message = context.getBean(MessageBean.class);
		System.out.println("\nBusiness Logic here...");
		System.out.println("Message is "+message.getMessage());
		
		((AbstractApplicationContext) context).close();

	}

}
