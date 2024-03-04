package com.dl.inheri;
class F{
	void m1() {
		System.out.println("something is missing ");
	}
}
class d extends F{
	void m2() {
		System.out.println("nothing is missing ");
	}
}
class e extends F{
	void m3() {
		System.out.println("chup chap baito ");
	}
}
public class Eg_3 {

	public static void main(String[] args) {
		e E1 = new e();
		E1.m1();
		E1.m3();
		d d1 = new d();
		d1.m2();

	}

}
