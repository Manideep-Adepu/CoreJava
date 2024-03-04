package com.dl.encap;
class A{
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
}

public class Eg_1 extends A{

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.setA(10);
		a1.setB(30);
		
		System.out.println(a1.getA() + a1.getB());
		
		

	}

}
