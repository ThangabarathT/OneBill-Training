package com.onebill.spring.bean;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Carxml {

	private String cname;
	private String speed;
	
	private Enginexml engine;
	
	public Carxml() {
		
	}
}
