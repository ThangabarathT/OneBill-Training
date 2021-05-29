package com.onebill.corejava.collection;

public class Students implements Comparable<Students> {
	int id;
	String sname;
	String schar;

	public Students(int id, String sname, String schar) {
		super();
		this.id = id;
		this.sname = sname;
		this.schar = schar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSchar() {
		return schar;
	}

	public void setSchar(String schar) {
		this.schar = schar;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", sname=" + sname + ", schar=" + schar + "]";
	}

	@Override
	public int compareTo(Students o) {
		return this.id - o.id;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
}
