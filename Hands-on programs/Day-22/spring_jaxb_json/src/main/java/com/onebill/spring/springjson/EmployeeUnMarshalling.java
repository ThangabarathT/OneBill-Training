package com.onebill.spring.springjson;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import com.onebill.spring.bean.EmployeeInfo;

public class EmployeeUnMarshalling {

	public static void main(String[] args) {

		try {

			ObjectMapper mapper = new ObjectMapper();
			EmployeeInfo info = mapper.readValue(new File("employeeinfo.json"), EmployeeInfo.class);
			System.out.println("Id : " + info.getEmpId());
			System.out.println("Name : " + info.getName());
			System.out.println("Mobile No : " + info.getMobileNumber());
			System.out.println("Mail-ID : " + info.getMailId());
			System.out.println("DOB : " + info.getDob());
			System.out.println("DOJ : " + info.getDoj());
			System.out.println("Department ID : " + info.getDetpId());
			System.out.println("Salary : " + info.getSalary());
			System.out.println("Password : " + info.getPassword());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
