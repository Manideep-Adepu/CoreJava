package com.dl.practice;
//Perform the addition by using overloading, 2 param, 3 param, 4 param

public class Eg_4 {
	void m1(int a, int b) {
		System.out.println(a+b);
	}
	void m1(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void m1(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}

	public static void main(String[] args) {
		Eg_4 eg = new Eg_4();
		eg.m1(10, 53);
		eg.m1(4,5, 6);
		eg.m1(6, 2, 6, 9);

	}

}
