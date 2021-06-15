package com.onebill.spring.springjaxb;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import java.io.File;
import java.util.ArrayList;

import com.onebill.spring.bean.UserAddresses;
import com.onebill.spring.bean.UserInfo;
import com.onebill.spring.bean.UserOtherInfo;

public class UserInfoMarshalling {

	public static void main(String[] args) {
		
		UserInfo user = new UserInfo();
		user.setEmpid(1);
		user.setName("Tony");
		user.setEmailId("Tony@Stark.com");
		user.setSalary(50000);
		user.setPassword("qwerty");
		
		UserOtherInfo otherInfo = new UserOtherInfo();
		otherInfo.setAge(35);
		otherInfo.setGender("Male");
		otherInfo.setMarried(false);
		
		UserAddresses pAdd = new UserAddresses();
		pAdd.setHouseNumber(10);
		pAdd.setStreet("MG Road");
		pAdd.setCity("BLR");
		pAdd.setTypeOfAddress('P');
		
		UserAddresses tAdd = new UserAddresses();
		tAdd.setHouseNumber(101);
		tAdd.setStreet("AT Road");
		tAdd.setCity("Salem");
		tAdd.setTypeOfAddress('T');
		
		UserAddresses gAdd = new UserAddresses();
		gAdd.setHouseNumber(377);
		gAdd.setStreet("EB Colony");
		gAdd.setCity("Namakkal");
		gAdd.setTypeOfAddress('G');
		
		List<UserAddresses> addresses = new ArrayList<UserAddresses>();
		addresses.add(pAdd);
		addresses.add(tAdd);
		addresses.add(gAdd);
		
		user.setUserOtherInfo(otherInfo);
		user.setUserAddresses(addresses);
		
		try {
			
			JAXBContext context = JAXBContext.newInstance(UserInfo.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(user, System.out);
			marshaller.marshal(user, new File("userinfo.xml"));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
