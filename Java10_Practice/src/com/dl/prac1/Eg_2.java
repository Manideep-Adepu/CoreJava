package com.dl.prac1;


import java.util.Scanner;

//Create a class hierarchy for different shapes - Circle and Rectangle. 
//Each shape should have a method to calculate its area. 
//Use an interface Shape to define the method calculateArea().
class shapes{
	double calculateArea() {
		return 0;
	}
}
class circle extends shapes{
//	float r;
//	public circle(float r) {
//		this.r = r;
//	}
	public double calculateArea(float r) {
		return Math.PI*r*r;
	}
}
class rectangle extends shapes{
//	float length;
//	float breadth;
//	public rectangle(float length, float breadth) {
//		this.length = length;
//		this.breadth = breadth;
//	}
	public double calculateArea(float length, float breadth) {
		return length*breadth;
	}
}

public class Eg_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		float r = scanner.nextFloat();
		System.out.println("Enter the length of rectangle");
		float length = scanner.nextFloat();
		System.out.println("Enter the breadth of rectangle");
		float breadth = scanner.nextFloat();
		
		circle Circle = new circle();
		System.out.println("Area of circle is: "+ Circle.calculateArea(r));
		
		rectangle rectangle1 = new rectangle();
		System.out.println("Area of Rectangle is: "+ rectangle1.calculateArea(length,breadth));
		
	}

}
