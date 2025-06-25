package javamethod;

public class NumberSum {

	public static void main(String[] args) {
		int num = 123;
		int remainder = 0;
		int sum = 0;
		while(num!=0) {
			remainder = num%10;
			sum = sum + remainder;
			num = num/10;
		}
        System.out.println(sum);
	}

}
