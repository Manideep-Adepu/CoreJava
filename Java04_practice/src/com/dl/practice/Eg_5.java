package com.dl.practice;

class circle{
	void AreaOf(float a, float b) {
		System.out.println("Area of circle is " + 3.14*b*b);
	}
}
class rectangle extends circle{
	void Areaof(float a, float b) {
		System.out.println("Area of rectangle is " + a*b);
	}
}
public class Eg_5 {

	public static void main(String[] args) {
		rectangle Rectangle = new rectangle();
		Rectangle.Areaof(3, 4);
		
		Rectangle.AreaOf( 3.14f, 2);

	}

}
