package com.number.programs;

import java.util.Scanner;

/*12234=5
 * three approaches 
 * 1)iterative approach*/
public class CountNumberOfInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to count number of digits ");
		int number = sc.nextInt();

		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		System.out.println("the number of digits " + count);
	}
}
