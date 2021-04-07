package com.number.programs;

import java.util.function.Supplier;

public class RandomNUmbers {
	public static void main(String[] args) {
		Supplier<String> str = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}

			return otp;

		};
		System.out.println(str.get());
		System.out.println(str.get());
		System.out.println(str.get());
		System.out.println(str.get());
		System.out.println(str.get());
		System.out.println(str.get());

	}
}