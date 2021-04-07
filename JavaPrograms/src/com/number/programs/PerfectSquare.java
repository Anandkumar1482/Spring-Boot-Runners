package com.number.programs;

import java.util.Scanner;

/*to check whether the number is perfect square or not
 * Every square of an integer is a perfect square*/
public class PerfectSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			if (i * i == number) {
				System.out.println("the number is perfect square " + i);
			}
			// System.out.println(i);
		}

	}
}
