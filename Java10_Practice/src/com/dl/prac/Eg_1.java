package com.dl.prac;

import java.util.Scanner;

class Rectangle{
	float length;
	float breadth;
	void m1(float length, float breadth) {
		float AreaOfRectangle = length*breadth;
		 System.out.println("Area of Rectangle: " + AreaOfRectangle);
		
	}
}

public class Eg_1 extends Rectangle{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length: ");
		float length = scanner.nextFloat();
		System.out.println("Enter the breadth: ");
		float breadth = scanner.nextFloat();
		
	    Rectangle rectangle1 = new Rectangle();	
	    rectangle1.m1(length, breadth);   
	}

}
