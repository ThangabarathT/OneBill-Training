package com.onebill.corejava.collection;

public class CustomArrayList implements Comparable<CustomArrayList> {
	int id;
	String name;
	public CustomArrayList(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(CustomArrayList o) {
		return this.id - o.id;
		//return 0;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
}
