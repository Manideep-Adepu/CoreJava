package com.dl.practice;

public class Eg_7 {

		public static void b(int n) {
			int[] binary = new int[1000];
			int i;
			for (i = 0; n>0; i++) {
				binary[i] = n%2;
				n = n/2;
			}
			for(int j = i-1; j>= 0; j--) {
				System.out.println(binary[j]);
			}
		}
	public static void main(String[] args) {
		int n = 17;
		System.out.println("Decimal number is " + n);
		System.out.println("binary number is ");
		b(n);

	}

}
