package com.dl.abs;
abstract class A{
	 void m1() {
		System.out.println("non abstract ");
	}
	 public abstract void m2();
}
class B extends A{
	
	@Override
	public void m2() {
		System.out.println("abstract method is excuted in another class ");
		
	}
}
public class Eg_1 {

	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		b1.m2();

	}

}
