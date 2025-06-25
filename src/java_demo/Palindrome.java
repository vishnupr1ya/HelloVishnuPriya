package java_demo;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		System.out.println(s.length());
		
		for(int i = 0; i <= s.length()/2; i++) {
			if(s.charAt(i) == s.charAt(s.length()-1-i)) {
				System.out.println("is palindrome");
			}else {
				System.out.println("Not a palindrome");
			}
		}

	}

}
