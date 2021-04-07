package com.array.programs;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = sc.nextInt();

		System.out.println("enter b number :");
		int b = sc.nextInt();

		System.out.println("enter c number :");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("the value a is largest " + a);
		} else if (b > c && b > a) {
			System.out.println("the value b is largest " + b);
		} else if (c > a && c > b) {
			System.out.println("the value c is largest " + c);
		} else {
			System.out.println("no values is greter");
		}
	}
}
