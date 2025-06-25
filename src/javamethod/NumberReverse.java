package javamethod;

public class NumberReverse {

	public static void main(String[] args) {
		int num = 123;
		
		int reversenum = 0;
		while(num!= 0) {
			int digit = num%10;
			reversenum = reversenum*10 + digit;
			num = num/10;
			
		}
		System.out.println(reversenum);

	}

}
