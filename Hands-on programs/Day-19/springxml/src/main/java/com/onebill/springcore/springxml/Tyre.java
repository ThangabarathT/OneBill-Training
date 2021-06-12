package com.onebill.springcore.springxml;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tyre {

	private String brand;
	
	public Tyre() {
		super();
	}
	
	public String toString() {
		return "It's Working";
	}
}
