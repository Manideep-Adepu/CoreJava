package com.dl.poly;

public class Eg_1 {
	void m1(int a, int b) {
		System.out.println(a + b);
	}
	void m1(double a, double b, double c) {
		System.out.println(a*b*c);
	}

	public static void main(String[] args) {
		//Polymorphism contains two methods
		//overloading and overriding
		Eg_1 poly = new Eg_1();
		poly.m1(1,2,3);
		poly.m1(5, 6);

	}

}
