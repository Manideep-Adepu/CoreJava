package com.dl.practice;
//Perform a basic multi level inher

class Earth{
	void m1() {
		float a = 10f;
		float b = 10f;
		float c = a + b;
		System.out.println(c);
	}
	
}

class country extends Earth{
	void m2() {
		double d = 21;
		double e = 32;
		double f = d*e;
		System.out.println(f);
	}
}

class state extends country{
	void m3() {
		String g = "telangana";
		String h = "andharapradesh";
		System.out.println(g + h);
	}
}
public class Eg_3 {

	public static void main(String[] args) {
		state State = new state();
		State.m1();
		State.m2();
		State.m3();
		
		

	}

}
