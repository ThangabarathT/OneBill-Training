package com.onebill.spring.springannotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired(required=false)
	@Qualifier("sd")
	MobileProcessor processor;
	
	public void config() {
		System.out.println("Octa Core, 4GB RAM, 64GBROM, 12MP Camera");
		processor.processor();
	}

	public MobileProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	}
}
