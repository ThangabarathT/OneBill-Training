package com.onebill.springcore.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private int age;
	private String name;

	private Department department;

	public Employee() {

	}
}
