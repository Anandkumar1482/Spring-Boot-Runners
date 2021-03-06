package com.array.programs;

import java.util.HashSet;
import java.util.Set;

public class ToCharArray {
	public static void main(String[] args) {
		String str = "anand";
		char[] ch = str.toCharArray();
		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
			}
		}
	}
}
