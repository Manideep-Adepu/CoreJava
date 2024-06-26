package com.dl.practice1;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.


public class eg_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		
		double number = sc.nextDouble();
		
		if(number%2 == 0) {
			System.out.println("Given number is even number ");
		}else {
			System.out.println("Given number is odd number ");
		}

	}

}
