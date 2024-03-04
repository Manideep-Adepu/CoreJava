package com.dl.abs;
abstract class G{
	 void m1() {
		System.out.println("instance method: ");
	}
	static void m2() {
		System.out.println("static method: ");
	}
}

public abstract class Eg_4 extends G{

	public static void main(String[] args) {
		G.m2();

	}

}
