package com.onebill.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mobile {
	private String brand;
	
	private Charge plugin;
	
	public Mobile() {
		super();
	}
	
	public void connect() { 
		if(plugin.getLevel()<20) {
			if(plugin.getStatus().equals("connect")) {
				System.out.println("Mobile get power and start charging to battery...");
			}
			else {
				System.out.println("Please Connect your charge");
				System.out.println("Mobile has insufficient power");
			}
		}
		else if(plugin.getLevel()==100) {
			if(plugin.getStatus().equals("connect")) {
				System.out.println("Battery power reach 100%. Please disconnect your charge");
			}
			else {
				System.out.println("Mobile has sufficient power then use can make calls and messages.");
			}
		}
		
	}
}
