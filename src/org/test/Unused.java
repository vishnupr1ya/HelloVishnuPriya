package org.test;

public class Unused {
	int id;
	public Unused(int id) {
		this.id = id;
		System.out.println("object created");
	}
	public void finalize() throws Throwable {
		System.out.println("Object destroyed");
	}

	public static void main(String[] args) {
		Unused a = new Unused(1);
		a = null;
		Unused b = new Unused(2);
		b = null;
		System.gc();

	}

}
