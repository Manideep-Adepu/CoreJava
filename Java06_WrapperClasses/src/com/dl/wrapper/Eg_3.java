package com.dl.wrapper;

public class Eg_3 {

	public static void main(String[] args) {
		//String to object
		//parameterized method
		String s1 = "10";
		Byte b = new Byte(s1);
		System.out.println(b);
		
		//Valueof() method
		Float Valueof = Float.valueOf(s1);
		System.out.println(Valueof);
		
		//object to string type 
		//tostring method
		Short s = Short.valueOf((short) 1);
		String Tostring = s.toString();
		System.out.println(Tostring);
		
		//+ operator
		Long l = Long.valueOf(20);
		String s2 = "" + l;
		System.out.println(s2);
		
		//primitive to string
		//tostring method
		byte b1 = 2;
		String s3 = Byte.toString(b1);
		System.out.println(s2);
		
	
	}

}
