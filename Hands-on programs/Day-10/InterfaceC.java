package com.onebill.corejava.java8features;

public interface InterfaceC {
	default void display() {
		System.out.println("display() inside a InterfaceA");
	}
}
