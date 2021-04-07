package com.number.programs;

public class SumOfThreeDigits {
	public static void main(String[] args) {

		int n = 123;
		int sum = 0;
		int remainder = 0;

		while (n != 0) {
			remainder = n % 10;
			sum = sum + remainder;
			n = n / 10;
		}
		System.out.println("the sum of three digits : " + sum);
	}
}
