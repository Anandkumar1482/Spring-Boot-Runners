package com.number.programs;

import java.util.Scanner;

public class FactorialNUmber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int f = 1;
		while (n != 0) {
			f = f * n;
			n--;
		}
		System.out.println("fact is " + f);
	}
}
