package org.test;

import java.util.Scanner;

public class B {
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public double add(double num1, double num2) {
		return num1+ num2;
	}
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
	 public static void main(String[] args) {
		 B b = new B();
		 System.out.println(b.add(10, 20));
		 System.out.println(b.add(9.5, 8.5));
		 b.add(10, 20, 30);
		
		
	}
	 
	 
	 

}
