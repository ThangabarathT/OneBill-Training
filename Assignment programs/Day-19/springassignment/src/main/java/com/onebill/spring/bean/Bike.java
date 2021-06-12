package com.onebill.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bike {

	private String bikename;
	private int speed;

	public Bike() {
		super();
	}
}
