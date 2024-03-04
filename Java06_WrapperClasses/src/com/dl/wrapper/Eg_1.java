package com.dl.wrapper;

public class Eg_1 {

	public static void main(String[] args) {
		//Primitive to object type
		//Parameterized method 
		byte b = 10;
		Byte b1 = new Byte(b);
		System.out.println(b1);
		
		Short s = new Short(b);
		System.out.println(s);
		
		short s1 = 20;
		Byte b2 = new Byte((byte) s1);
		System.out.println(b2);
		
		float f = 10.0f;
		Float f1 = new Float(f);
		System.out.println(f1);
		
		//Valueof() method
	    int i = 40;
	    Integer ValueOf = Integer.valueOf(i);
	    System.out.println(ValueOf);
	    
	    Float f2 = Float.valueOf(i);
	    System.out.println(f2);
	    
	    Byte b3 = Byte.valueOf((byte)i);
	    System.out.println(b3);
	    
	    //Auto boxing
	    long l = 50;
	    Long l1 = l;
	    System.out.println(l1);
	    
	    Short s2 = (short)l;
	    System.out.println(s2);

	}

}
