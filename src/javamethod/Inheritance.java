package javamethod;
class Parent{
	int a = 10;
	void display() {
		System.out.println(a);
	}
}
	class Child1 extends Parent {
		int b = 20;
		void print() {
			System.out.println(b);
			
			
		}
	}
	class Child2 extends Parent {
		int c = 30;
		void show() {
			System.out.println(c);
		}
	}


public class Inheritance {
	public static void main(String[] args) {
		Child2 child = new Child2();
		child.display();
		
		
	}

}
