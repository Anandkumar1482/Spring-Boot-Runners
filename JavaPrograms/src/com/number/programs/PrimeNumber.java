package com.number.programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");
		int num = sc.nextInt();
		boolean count = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count = false;
				break;
			}

		}
		if (count == true)
			System.out.println("the number is prime " + count);
		else {
			System.out.println("the number is not prime");
		}
	}
}
