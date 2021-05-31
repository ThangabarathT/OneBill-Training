package com.onebill.corejava.java8features;

import java.util.Optional;

public class OptionalClassDemo {
	
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("A is present : "+a.isPresent());
		System.out.println("B is present : "+a.isPresent());
		Integer first = a.orElse((Integer)0);
		Integer second = b.orElse((Integer)0);
		return first+second;
	}

	public static void main(String[] args) {
		OptionalClassDemo op = new OptionalClassDemo();
		Integer value1 = new Integer(30);
		Integer value2 = new Integer(70);
		
		Optional<Integer> val1 = Optional.ofNullable(value1);
		Optional<Integer> val2 = Optional.ofNullable(value2);
		
		System.out.println("Sum : "+ op.sum(val1, val2));
	}

}
