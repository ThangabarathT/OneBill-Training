package com.onebill.spring.springannotationdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("sd")
//@Primary
public class SnapDragon implements MobileProcessor{

	@Override
	public void processor() {
		System.out.println("Use Snapdrogan....");
		
	}

}
