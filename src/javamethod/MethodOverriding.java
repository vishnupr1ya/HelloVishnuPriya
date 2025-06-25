package javamethod;
class Test{
	  final int a = 2;
	  void m1(int b) {
		System.out.println(b);
	}
}
class Test2 extends Test{
	int a = 3;
	
	void m1(int b) {
		System.out.println(b*b);
		super.m1(b);
	}
	void m1(int b, int c) {
		System.out.println(b*c);
		
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1(10);

		int d = t.a ;

		System.out.println(t.a);
		 
		

	}

}
