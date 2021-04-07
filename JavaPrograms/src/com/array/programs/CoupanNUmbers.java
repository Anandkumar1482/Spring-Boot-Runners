package com.array.programs;

import java.util.Random;

public class CoupanNUmbers {
	public static void main(String[] args) {
		String str = "abcde";
		char[] ch = str.toCharArray();
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		// objects of type String are read only and immutable. The StringBuffer class is
		// used to represent characters that can be modified
		int max = 10;
		for (int i = 0; i < max; i++) {
			char c = ch[random.nextInt(ch.length)];
			sb.append(c);
		}
		String coupon = sb.toString();
		System.out.println("coupon code:  " + coupon);
	}
}
