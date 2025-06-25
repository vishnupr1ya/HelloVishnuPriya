package java_demo;

public class FindingCharacter {

	public static void main(String[] args) {
		String s1 = "GreensTechnology";
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == 'h') {
				System.out.println(s1.charAt(i));
			}
		}
		
		String s2 = "SeleniumAutomationtool";
		for(int i = 0; i < s2.length(); i++) {
			if(s1.charAt(i) == 'o') {
				System.out.println(s1.charAt(i));
				break;
			}
		}
		
		String s3 =  "velmurugan";
		for(int i = 0; i < s3.length(); i++) {
			if(s3.charAt(i) == 'u') {
				System.out.println(s3.charAt(i));
				break;
			}
		}
		
	
		String s4 =  "j a v a p r o g r a m";
		for(int i = 0; i < s4.length(); i++) {
			if(s4.charAt(i) == 'p') {
				System.out.println(s4.charAt(i));
			}
		}
		String s5 = "9944152058";
		for(int i = 0; i < s5.length(); i++) {
			if(s5.charAt(i) == '0') {
				System.out.println(s5.charAt(i));
				break;
			}
		}

	}

}
