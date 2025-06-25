package javamethod;

public class FibonacciSeries {

	public static void main(String[] args) {
		//fibonacci a + b = c sum of two adjacent numbers = third number
		int a = 0;
		int b = 1;
		int c = 1;
		for(int i = 0; i < 12; i++) {
			System.out.println(a);
			a = b;
			b = c;
			c = a + b;
			
		}
	
		

	}

}
