package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Scope(scopeName="prototype")
@Component
public class CarMixed {

	private String cname;
	private String speed;

	@Autowired
	private EngineMixed engine;

	public CarMixed() {
		super();
	}

}
