package com.onebill.spring.bean;

public class BeanFactoryPostProcessorBean {

	private String name;
	private int age;
	
	public BeanFactoryPostProcessorBean() {
		System.out.println("Inside Default No-arg Constructor......");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void init() {
		System.out.println("\nInside init method....");
	}
	
	public void distroy() {
		System.out.println("\nInside distroy method....");
	}
	
}
