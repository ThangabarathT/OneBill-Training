package com.onebill.corejava.collection;

import java.util.Comparator;

public class SortBySname implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return o1.sname.compareTo(o2.sname);
	}

}
