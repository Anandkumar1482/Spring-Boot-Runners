package com.array.programs;

import java.util.Random;

public class Coupan {
	public static void main(String[] args) {
		String str = "abcdewhsdwdhwdjwvdwjwd12345";
		char[] ch = str.toCharArray();
		System.out.println(str);
		System.out.println(ch.length);

		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			char c = ch[random.nextInt(ch.length)];
			sb.append(c);
		}
		sb.toString();
		System.out.println("the random number is " + sb);
	}
}
