package com.dl.prac;

import java.util.Scanner;

class person{
//	String pName;
//	double age;
	public void m1(String pName, float age) {
//		this.pName = pName;
//		this.age = age;
		if(age>=18) {
			System.out.println(pName +" "+ "is eligible for vote.");
		}else {
			System.out.println(pName +" "+ "is not eligible for vote.");
		}
	}
}

public class Eg_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter person name");
		String pName = scanner.next();
		System.out.println("enter age of person");
		float age = scanner.nextFloat();
		
		person Person = new person();
		Person.m1(pName, age);
		

	}

}
