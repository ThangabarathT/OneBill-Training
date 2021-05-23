/* Example program for Constructor Overloading 
 * 
 * Create multiple constructors with the same name 
 * but with different parameters types or with different 
 * no of parameters
 * 
 */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
class Person {
	String name;
	int age;

	/** Default Constructor */
	public Person() {
		name = "Not-Know";
		age = 0;
	}

	/** Constructor with one parameter */
	public Person(String name) {
		this();
		this.name = name;
	}

	/** Constructor with two parameter */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Person obj1 = new Person();
		Person obj2 = new Person("Barath");
		Person obj3 = new Person("Barath", 20);
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());

	}

}
