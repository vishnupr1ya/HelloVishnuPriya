package java_demo;

public class ArrayAverage {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		double average = 1;
		for(int x : a) {
			sum = sum + x;
		}
		average = average *sum/a.length;
		System.out.println(average);

	}

}
