package com.dl.practice;

import java.util.Scanner;

public class Eg_8 {

	public static int a() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();
		for(int i= 1; i<=n; i++) {
			n *= i;
			return n;
		}
		System.out.println(n);
		return 0;
	}

	public static void main(String[] args) {
		a();

}
}
