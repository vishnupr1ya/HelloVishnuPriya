package org.test;

public class Singleton {
	private static Singleton instance;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		Singleton a = getInstance();
		Singleton b = getInstance();
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(a));

	}

}
