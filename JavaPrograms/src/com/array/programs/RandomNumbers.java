package com.array.programs;

public class RandomNumbers {
	public static void main(String[] args) {

		String otp = "";
		for (int i = 0; i < 6; i++) {
			otp = otp + (int) (Math.random() * 10);
		}
		System.out.println(otp);
	}
}
