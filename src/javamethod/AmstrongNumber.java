package javamethod;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int remainder = 0;
		double result = 0;
		int originalnum = num;
		while(num!= 0) {
			remainder =  num%10;
			
			result = result + Math.pow(remainder, 3);
			num = num/10;
			
		}
		System.out.println(result);
		if(result == originalnum) {
			System.out.println("Is Amstrognumber");
		}else {
			System.out.println("Not Amstrongnumber");
		}

	}

}
