package javamethod;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 141;
		int reverseNum = 0;
		int originalNum = num;
		while(num!= 0) {
			int digit = num%10;
			reverseNum = reverseNum*10 + digit;
			num = num/10;
			
		}
		if(reverseNum == originalNum) {
			System.out.println("Is palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
	}
	

}
