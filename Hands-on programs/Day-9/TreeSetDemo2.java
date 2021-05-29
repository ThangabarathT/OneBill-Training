package com.onebill.corejava.collection;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<Students> ts = new TreeSet<Students>(new SortBySname());
		ts.add(new Students(12, "Barath", "Good"));
		ts.add(new Students(34, "Sathish", "Modarate"));
		ts.add(new Students(8, "Vignesh", "Well"));
		ts.add(new Students(28, "Mani", "Best"));
		
		for(Students s:ts) {
			System.out.println(s.sname);
		}

	}

}
