package com.onebill.spring.springjaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.onebill.spring.bean.UserAddresses;
import com.onebill.spring.bean.UserInfo;

public class UserInfoUnMarshalling {

	public static void main(String[] args) {

		try {

			JAXBContext context = JAXBContext.newInstance(UserInfo.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			UserInfo userInfo = (UserInfo) unmarshaller.unmarshal(new File("userinfo.xml"));
			System.out.println("Employee ID : " + userInfo.getEmpid());
			System.out.println("Employee Name : " + userInfo.getName());
			System.out.println("Employee age : " + userInfo.getUserOtherInfo().getAge());
			System.out.println("Employee Gender : " + userInfo.getUserOtherInfo().getGender());
			System.out.println("Addresses : ");
			for (UserAddresses address : userInfo.getUserAddresses()) {
				System.out.println(address.getHouseNumber());
				System.out.println(address.getStreet());
				System.out.println(address.getCity());
				System.out.println(address.getTypeOfAddress());
				System.out.println("----------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
