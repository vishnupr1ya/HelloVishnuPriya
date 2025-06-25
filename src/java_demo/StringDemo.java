package java_demo;

import java.util.Arrays;

public class StringDemo {
	String s = "wel@c o m e";
	String s1 = new String("java");
	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
		System.out.println(sd.s.trim());
		System.out.println(sd.s.replace("@", ""));
		System.out.println(sd.s.contains("com"));
		
		 System.out.println(sd.s.length());
		 System.out.println(sd.s.concat(sd.s1));
		 System.out.println(sd.s.substring(0,4));
		 System.out.println(sd.s.replace('m', 'x'));
		 System.out.println(sd.s.equals(sd.s1));
		 System.out.println(sd.s.charAt(0));
		 System.out.println(sd.s.toUpperCase());
		 String[]a = sd.s.split("@");
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 System.out.println(Arrays.toString(a));
		 String amount = "$15,20,55";
		 
		 System.out.println(amount.replace("$","").replace(",", ""));
		 System.out.println(amount.replace(',', ' '));
		 for(int i = sd.s.length()-1;i >=0; i--) {
			 System.out.println(sd.s.charAt(i));
			 
		 }
		 
		 
		
	}
   
		

}
