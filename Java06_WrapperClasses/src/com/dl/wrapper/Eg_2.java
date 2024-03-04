package com.dl.wrapper;

public class Eg_2 {

	public static void main(String[] args) {
		//Object type to primitive type
		//intValue() method
		Integer i = Integer.valueOf(20);
		int intValue = i.intValue();
		System.out.println(intValue);
		
		float f = i.floatValue();
		System.out.println(f);
		
		short s = i.shortValue();
		System.out.println(s);
		
		//Auto Unboxing method
		Short s2 = new Short((short) 10);
		short s3 = s2;
		System.out.println(s3);

	}

}
