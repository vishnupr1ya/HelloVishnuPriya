package javamethod;

public class Primenumber {

	public static void main(String[] args) {
		//0 & 1 are not prime numbers
		int num = 11;
		boolean isPrime = false;
		if(num == 0 || num == 1) {
			isPrime = false;
		}
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
			}else {
				isPrime = true;
				
			}
		}
		System.out.println(isPrime);

	}

}
