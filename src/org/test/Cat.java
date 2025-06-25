package org.test;

public class Cat extends Animal {
	public Cat(String name, String colour) {
		super(name,colour);
	}
	
	void makeNoise() {
		System.out.println(name + "is meowing.");
		
	}
	public static void main(String[] args) {
		Cat cat = new Cat("Whiskers","white");
		cat.eat();
		cat.makeNoise();
	}

}
