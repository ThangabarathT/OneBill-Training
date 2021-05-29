package com.onebill.corejava.collection;

public class Student implements Comparable<Student> {
	int id;
	String name;
	int marks;

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public boolean equals(Object o) {
		if (o != null && o instanceof Student) {
			String name = ((Student) o).getName();
			if (name != null && name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Student o) {
		return o.id - this.id;
	}

	public int hashCode() {
		return this.id;
	}
}
