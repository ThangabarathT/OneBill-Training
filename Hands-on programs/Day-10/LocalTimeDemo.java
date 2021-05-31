package com.onebill.corejava.java8features;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {
public static void main(String[] args) {
	LocalTime now = LocalTime.now();
	System.out.println("Now time is : "+ now);
	
	LocalTime specTime = LocalTime.of(20, 45, 28, 977553);
	System.out.println("Specific time of the day : "+specTime);
	
	LocalTime zoneTime = LocalTime.now(ZoneId.of("Asia/Tokyo"));
	System.out.println("Current time in Asia/Tokyo : "+zoneTime);
	
	LocalTime timebasedonsecend = LocalTime.ofSecondOfDay(40000);
	System.out.println("Time in second is : "+timebasedonsecend);
}
}
