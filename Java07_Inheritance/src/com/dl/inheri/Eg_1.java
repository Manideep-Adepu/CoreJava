package com.dl.inheri;
class A{
	public void m1(){
		System.out.println("Class A");
	}
}
class B extends A{
	public void m2() {
		System.out.println("Class B");
	}
}
public class Eg_1 {

	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		b1.m2();

	}

}
