package com.onebill.springcore.bean;

import lombok.AllArgsConstructor;

import lombok.Data;

@Data
@AllArgsConstructor
public class Department {

	private int deptid;
	private String deptname;

	public Department() {

	}
}
