package java_demo;

import java.util.Scanner;

public class EqualStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string names");
		String s1 = sc.next();
		String s2 = sc.next();
		if(s1.equals(s2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		String s3 = sc.next();
		String s4 = sc.next();
		if(s3.equals(s4)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		String s5 = sc.next();
		String s6 = sc.next();
		if(s5.equals(s6)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		String s7 = sc.next();
		String s8 = sc.next();
		if(s7.equalsIgnoreCase(s8)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		String s9 = sc.next();
		String s10 = sc.next();
		if(s9.equalsIgnoreCase(s10)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}

}
