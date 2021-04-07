package com.string.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string as the input");
		String str = sc.nextLine();
		duplicateString(str);
	}

	private static void duplicateString(String str) {
		Set<Character> set = new HashSet<Character>();
		List<Character> list = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);// str.charAt(0) -->a
			if (!set.contains(ch)) {// if 's' has not present in hashSet
				set.add(ch);// add to set
				sb.append(ch);
			} else {
				list.add(ch);
				sb1.append(ch);
			}
		}
		sb.toString();
		sb1.toString();
		System.out.println("duplicate elements are :" + sb1);
		System.out.println("after removing duplicates from the string :" + sb);
	}
}