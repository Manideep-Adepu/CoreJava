package com.dl.typecasting;

public class Eg_2 {

	public static void main(String[] args) {
		float f = 20.0f;
		int i = (int)f;
		
		double d = 10;
		long b = (long)d;
		
		int c = (int)(i + b);
		System.out.println(c);

	}

}
