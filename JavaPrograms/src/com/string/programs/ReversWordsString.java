package com.string.programs;

public class ReversWordsString {
	public static void main(String[] args) {
		String str = "welcome to the world";
		String[] str1 = str.split(" ");
		for (String string : str1) {
			System.out.println(string);
		}
		System.out.println();
		// System.out.println(str1);
		for (int i = str1.length - 1; i >= 0; i--) {
			System.out.println(str1[i]);
		}
	}
}
