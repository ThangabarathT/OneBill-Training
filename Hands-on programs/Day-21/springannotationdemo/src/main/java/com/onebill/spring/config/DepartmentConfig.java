package com.onebill.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.onebill.spring.bean.Department;

@Configuration
public class DepartmentConfig {

	//@Bean(name="main")
	@Bean(name="department")
	//@Primary
	// by name it should be same as reference variable which is auto-wired
	public Department getDepartment() {
		Department dept = new Department();
		dept.setDeptid(101);
		dept.setDeptname("Main-Department");
		return dept;
	}
	
	@Bean(name="hr")
	//@Primary
	public Department getHRDepartment() {
		Department dept = new Department();
		dept.setDeptid(102);
		dept.setDeptname("Hr-Department");
		return dept;
	}
	
	@Bean(name="ac")
	//@Primary
	public Department getACDepartment() {
		Department dept = new Department();
		dept.setDeptid(103);
		dept.setDeptname("Ac-Department");
		return dept;
	}
}
