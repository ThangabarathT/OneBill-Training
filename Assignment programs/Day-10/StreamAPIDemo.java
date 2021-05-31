/* Example for Stream API
 * 
 * Map: The map method is used to returns a stream consisting of 
 * the results of applying the given function to the elements of 
 * this stream.
 * 
 * 
 *  */

package com.onebill.corejava.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		System.out.println("------List-------");
		System.out.println(list);
		
		System.out.println("\n------Square List-------");
		List<Integer> sq = list.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(sq);

		System.out.println("\n------Square Set-------");
		Set<Integer> sqset = list.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(sqset);
		
		System.out.println("\n------for Each-------");
		list.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		List<String> name = Arrays.asList("Tony", "Peter", "Steve");
		System.out.println("\n------List-------");
		System.out.println(name);
		
		System.out.println("\n------Filter-------");
		List<String> result = name.stream().filter(s -> s.startsWith("T")).collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println("\n------Sort-------");
		List<String> show = name.stream().sorted().collect(Collectors.toList());
		System.out.println(show);

	}

}
