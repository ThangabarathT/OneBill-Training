package com.onebill.springcore.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean{

	private String message;

	public Message() {
		System.out.println("Inside Constructor");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void first() {
		System.out.println("Inside first....");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet....");
		
	}

	public void destroy() throws Exception {
		System.out.println("Inside a destroy....");
		
	}
}
