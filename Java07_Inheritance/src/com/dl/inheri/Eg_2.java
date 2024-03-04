package com.dl.inheri;
class N{
	void m1() {
		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}
}
class M extends N{
	void m2() {
		System.out.println("addition of a and b");
	}
}
class C extends M{
	void m3() {
		int d = 3;
		int e = 5;
		int f = d*e;
		System.out.println(f);
	}
}

public class Eg_2 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m1();
		c1.m2();
		c1.m3();

	}

}
