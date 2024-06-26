package com.dl.practice1;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.

public class eg_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name to greet ");
		
		String name = sc.next();
		
		if(name != "admin") {
			System.out.println(name + " ,\"The greatest glory in living lies not in never falling, but in rising every time we fall.\" ");
		}else {
			System.out.println("Provide proper name ");
		}

	}

}
