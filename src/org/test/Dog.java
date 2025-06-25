package org.test;

public class Dog extends Animal {
	public Dog(String name, String colour) {
		super(name,colour);
	}
	
	void bark() {
		System.out.println(name + "is barking.");
	}

	public static void main(String[] args) {
		Dog dog = new Dog("Buddy","brown");
		Animal animal = new Animal("Monkey", "black");
		dog.eat();
		dog.bark();
		animal.eat();
				

	}

}
