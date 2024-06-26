package com.dl.practice;

public class Eg_10 {
	
	public static void bit(int m, int n) {
		m = m^n;
		n = m^n;
		m = m^n;
		System.out.println(m);
		System.out.println(n);
	}

	public static void main(String[] args) {
		bit(10, 12);

	}

}
