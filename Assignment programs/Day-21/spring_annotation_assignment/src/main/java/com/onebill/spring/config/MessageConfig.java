package com.onebill.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onebill.spring.bean.MessageBean;
import com.onebill.spring.bean.MyBeanFactoryPP;
import com.onebill.spring.bean.MyBeanPP;

@Configuration
public class MessageConfig {

	@Bean
	public MessageBean message() {
		return new MessageBean("Hello everyone...");
	}
	
	
	@Bean
	public MyBeanPP bpp() {
		return new MyBeanPP();
	}
	
	@Bean
	public MyBeanFactoryPP bfpp() {
		return new MyBeanFactoryPP();
	}
}
