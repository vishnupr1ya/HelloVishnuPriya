package java_demo;

import java.util.Scanner;

public class ValidationString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mailId :");
		String mailId = sc.next();
		for(int i = 0; i < mailId.length(); i++) {
			if(mailId.charAt(i) == '@') {
				System.out.println("valid EmailId");
			
		}

	}
		System.out.println("Enter phonenumbers :");
		String phoneNo1 = sc.next();
		String phoneNo2 = sc.next();
		if(phoneNo1.length() == 10) {
			System.out.println("valid phonenumber");
		}else
			System.out.println("Invalid phonenumber");
		if(phoneNo2.length() == 10) {
			System.out.println("valid phonenumber");
		}else
			System.out.println("Invalid phonenumber");
       

}
}
