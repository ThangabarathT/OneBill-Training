package com.onebill.spring.springannotationdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Intel implements MobileProcessor{

	@Override
	public void processor() {
		System.out.println("Mobile use Intel Processor...");
		
	}

}
