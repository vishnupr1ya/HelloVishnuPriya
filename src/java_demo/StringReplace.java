package java_demo;

public class StringReplace {
	public static void main(String[] args) {
		/*String s = "Welcome to class Java";
		String s2 = s.replaceAll("Java", "sql");
		System.out.println(s2);
		
		String s1 = "Greens Adyar";
		String s3 = s1.replaceAll("Adyar", "Omr");
		System.out.println(s3);
		
		String s4 = "welcome to Java class";
		String s5 = s4.replace(' ', '#');
		System.out.println(s5);
		
		String st = "greenstechchennaiomr@gmail.com";
		if(st.contains("@")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}*/
        String phoneNo = "90954a6078";
        
        for(int i = 0; i < phoneNo.length(); i++) {
        	char ch = phoneNo.charAt(i);
        if((ch >= 'a') && (ch<='z')) {
        	System.out.println("Invalid phone number");
        	break;
        	
        }
      
		
	}
	}
}
