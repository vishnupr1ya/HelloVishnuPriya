package org.test;

public class Animal {
	String name;
	String colour;
	public Animal(String name, String colour) {
		this.name = name;
		this.colour = colour;
		
	}
	
	void eat() {
		System.out.println(name + "is eating.");
	}

}
