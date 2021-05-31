package com.onebill.corejava.java8features;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Current Date is : "+today);
		
		LocalDate someDate = LocalDate.of(2014, Month.AUGUST, 4);
		System.out.println("Some Date Value is : "+someDate);
		
		LocalDate Zone = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date from Zone Asia/Kolkata : "+Zone);
		
		LocalDate datefromEpoch = LocalDate.ofEpochDay(365);
		System.out.println("Trying epoch date : "+datefromEpoch);
	}

}
