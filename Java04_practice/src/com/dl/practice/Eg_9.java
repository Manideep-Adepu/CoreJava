package com.dl.practice;

import java.util.Scanner;

public class Eg_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		String neww = Integer.toString(num);
		StringBuffer sb = new StringBuffer(neww).reverse();		
		String eg = sb.toString();
		int num1 = Integer.parseInt(eg);
		
		if(num == num1) {
			System.out.println("the given number is palindrome number: " + sb);
		}else{
			System.out.println("the given number is not a palindrome number ");
		}
	}

}
