package com.string.programs;

import java.util.Scanner;

public class PolindromString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter  string ");
		String original = sc.nextLine();
		String rev = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
		if (original.equals(rev)) {
			System.out.println("the string is polindrom");
		} else {
			System.out.println("the string is not polindrom");
		}
	}
}