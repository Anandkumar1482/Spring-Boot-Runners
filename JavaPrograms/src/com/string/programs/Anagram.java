package com.string.programs;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "vaja";

		System.out.println(anagramCheck(str1, str2));
		System.out.println("the two strings are anagrams " + str1 + "  " + str2);
	}

	private static boolean anagramCheck(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		System.out.println(ch1);
		Arrays.sort(ch2);
		System.out.println(ch2);
		return Arrays.equals(ch1, ch2);

	}
}
