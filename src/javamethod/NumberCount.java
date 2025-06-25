package javamethod;

public class NumberCount {

	public static void main(String[] args) {
		int num = 123;
		int count = 0;
		int remainder = 0;
		while(num != 0) {
			remainder =  num%10;
			num = num/10;
			count = count + 1;
			
		}
		System.out.println(count);

	}

}
