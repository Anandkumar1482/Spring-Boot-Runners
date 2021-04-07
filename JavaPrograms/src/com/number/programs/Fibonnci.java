package com.number.programs;

import java.util.Scanner;

/*the previous two numbers is next number*/
public class Fibonnci {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many digits you want");
		int count = sc.nextInt();

		int[] array = new int[count];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i < count; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		for (int j : array) {
			System.out.println(j);
		}

	}
}