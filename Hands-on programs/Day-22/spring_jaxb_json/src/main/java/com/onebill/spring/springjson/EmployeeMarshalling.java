package com.onebill.spring.springjson;

import java.io.File;
import java.util.Date;

import org.codehaus.jackson.map.ObjectMapper;

import com.onebill.spring.bean.EmployeeInfo;

public class EmployeeMarshalling {

	public static void main(String[] args) {

		EmployeeInfo infoBean = new EmployeeInfo();
		infoBean.setEmpId(1);
		infoBean.setName("Tony");
		infoBean.setMobileNumber(987654321);
		infoBean.setMailId("Tony@stark.com");
		infoBean.setDob(new Date());
		infoBean.setDoj(new Date());
		infoBean.setDetpId(23);
		infoBean.setSalary(50000);
		infoBean.setPassword("qwerty");

		try {

			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File("employeeinfo2.json"), infoBean);
			System.out.println("Write Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
