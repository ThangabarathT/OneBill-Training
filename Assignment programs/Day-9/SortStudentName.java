package com.onebill.corejava.collection;

import java.util.Comparator;

public class SortStudentName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}

}
