package com.onebill.spring.springjaxb;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.onebill.spring.bean.EmployeeInfo;

/**
 * Hello world!
 *
 */
public class EmployeeMarshallingTest {
	
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
			JAXBContext context = JAXBContext.newInstance(EmployeeInfo.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(infoBean, System.out);
			marshaller.marshal(infoBean, new File("employeeinfo.xml"));
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
