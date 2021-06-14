package com.onebill.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements InitializingBean, DisposableBean{

	private String message;

	public MessageBean() {
		super();
		System.out.println("Inside Default No-arg Constructor...");
	}

	public MessageBean(String message) {
		super();
		this.message = message;
		System.out.println("Inside single arg Constructor...");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageBean [message=" + message + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("\nInside Destroy method...");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("\nInside afterPropertiesSet(init) method...");
		
	}

}
