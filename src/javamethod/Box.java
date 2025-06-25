package javamethod;

public class Box {
	double  width;
	double height;
	double depth;
	Box(){
		width = height = depth = 0;
		
	}
	Box(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
		
	}
	Box(double l){
		width = height = depth = l;
		
	}
	void volume(){
		System.out.println(width*height*depth);
		
	}

}
