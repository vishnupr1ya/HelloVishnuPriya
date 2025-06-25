package javamethod;
interface Shape{
	int length = 10;
	int width = 20;
	void square();
	default void rectangle() {
		System.out.println(length *width);
}
	static void triangle() {
		System.out.println(length);
	}
}

public class InterfaceDemo implements Shape {
	public void square() {
		System.out.println(length * length);
	}
	void circle() {
		System.out.println(width);
	}

	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo();
		Shape sh = new InterfaceDemo();
		sh.square();
		id.circle();
		Shape.triangle();

	}

}
