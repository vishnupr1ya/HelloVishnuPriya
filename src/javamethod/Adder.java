package javamethod;

public class Adder {
	 static int a = 10;  static int b = 20; int c = 60;
	void add(){
		System.out.println(a + b);

}
	static int add(int a,int b) {
		
		return( a+ b);
		
	}
	void add(int x,int y, int z) {
		System.out.println(x + y + z);
		System.out.println(a);
		
	}
	void add(int x,double y) {
		System.out.println(x + y);
		
	}
	void add(double x,int y) {
		System.out.println(x + y);
}
	public static void main(String[] args) {
		System.out.println(args.length);
		for(String value : args) {
		System.out.println(value);
		}
		
		
}
}