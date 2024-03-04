package com.dl.poly;
class A{
	void m1(int a, int b) {
		System.out.println(a+b);
	}
}
class B extends A{
	void m1(int a, int b) {
		System.out.println(a*b);
	}
}

public class Eg_2 {

	public static void main(String[] args) {
		B a1 = new B();
		a1.m1(3, 5);

	}

}
