package com.onebill.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Charge {

	private String status;
	private int level;
	
	public Charge() {
		super();
	}
}
