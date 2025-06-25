package org.test;

public class Sample {
	public static void validate(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Age must be 18 or above.");
		}
		System.out.println("valid age:"+age);
		
	}

	public static void main(String[] args) {
		try {
			validate(12);
				
			
		}catch(InvalidAgeException e) {
			System.out.println("caught Exception:"+e.getMessage());
		}
		

	}

}
