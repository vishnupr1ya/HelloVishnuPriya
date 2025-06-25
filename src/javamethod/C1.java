package javamethod;
interface I1{
	int x = 100;
	void m1();
}
interface I2{
	int y = 200;
	void m2();
}
class C2{
	int z = 300;
	void m3() {
		System.out.println(z);
	}
	
}

public class C1 extends C2 implements I1,I2 {
	public void m1() {
		System.out.println(x);
		
	}
	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		C1 c1obj = new C1();
		I2 obj = new C1();
      

	}

}
