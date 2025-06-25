package java_demo;

public class StringReverse {
	String s = "welcome";
	String rev = "";
	public static void main(String[] args) {
		StringReverse sr = new StringReverse();
		for(int i = sr.s.length()-1; i >=0; i--) {
			sr.rev = sr.rev + sr.s.charAt(i);
			
		}
		System.out.println(sr.rev);
		

	}

}
