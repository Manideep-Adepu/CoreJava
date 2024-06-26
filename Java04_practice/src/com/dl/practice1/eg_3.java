package com.dl.practice1;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.


public class eg_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal amount ");
		
		float principal = sc.nextFloat();
		
		System.out.println("enter time in terms of years ");
		
		float time = sc.nextFloat();
		
		System.out.println("enter rate of interest per annunam ");
		float rate = sc.nextFloat();
		
		float simpleInterest = (principal*time*rate)/100 ;
		
		System.out.println("Simple interest earned is " + simpleInterest);
	}

}
