package com.string.programs;

import java.util.Scanner;

public class NumberOfVowels {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String original = sc.nextLine();
		char[] ch = original.toCharArray();

		int count = 0;
		for (char c : ch) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;

			}
		}
		System.out.println("the number of vowels are there " + count);
	}
}
