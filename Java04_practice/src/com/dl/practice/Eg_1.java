package com.dl.practice;
import java.util.Scanner; 

public class Eg_1 {

	public static void main(String[] args) {
		Scanner big = new Scanner(System.in);
		System.out.println("Enter three number: ");
		
		int a = big.nextInt();
		int b = big.nextInt();
		int c = big.nextInt();
		
		if(a>b) {
			System.out.println("First number is big: " + a);
		}else if(b>c) {
			System.out.println("Second number is big: " + b);
		}else if(c>a) {
			System.out.println("Third number is big: " + c);
		}else {
			System.out.println("Invaild number!");
		}
	}

}
