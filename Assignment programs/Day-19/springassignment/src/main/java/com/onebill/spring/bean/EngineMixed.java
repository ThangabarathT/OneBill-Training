package com.onebill.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EngineMixed {

	private String capacity;

	public EngineMixed() {
		super();
	}

}
