package com.onebill.spring.springjson;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import com.onebill.spring.bean.UserAddresses;
import com.onebill.spring.bean.UserInfo;

public class UserInfoUnMarshalling {

	public static void main(String[] args) {

		try {

			ObjectMapper mapper = new ObjectMapper();
			UserInfo userInfo = mapper.readValue(new File("userinfo.json"), UserInfo.class);
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
