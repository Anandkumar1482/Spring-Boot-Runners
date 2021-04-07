package com.array.programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementArray {
	public static void main(String[] args) {
		String[] str = new String[] { "java", "spring", "hibernate", "java", "spring" };
		Set<String> duplicateSet = new HashSet<String>();
		HashSet<String> nonDuplicateSet = new HashSet<String>();
		for (String string : str) {
			if (!nonDuplicateSet.contains(string)) {
				nonDuplicateSet.add(string);
			} else {
				duplicateSet.add(string);
			}
		}
		System.out.println(duplicateSet + " duplicate element in string[]");
		System.out.println(nonDuplicateSet + " nonduplicate element in string[]");
	}
}
