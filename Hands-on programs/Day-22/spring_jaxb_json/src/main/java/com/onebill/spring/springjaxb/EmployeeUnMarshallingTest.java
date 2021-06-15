package com.onebill.spring.springjaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.onebill.spring.bean.EmployeeInfo;

public class EmployeeUnMarshallingTest {

	public static void main(String[] args) {

		try {

			JAXBContext context = JAXBContext.newInstance(EmployeeInfo.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			EmployeeInfo emp = (EmployeeInfo) unmarshaller.unmarshal(new File("employeeinfo.xml"));
			System.out.println(emp);
			System.out.println("Employee ID : " + emp.getEmpId());
			System.out.println("Employee Name : " + emp.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
