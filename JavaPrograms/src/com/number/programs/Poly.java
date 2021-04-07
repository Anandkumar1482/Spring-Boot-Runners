package com.number.programs;

public class Poly {
	public static void main(String args[]) {
		int r, rev = 0, temp;
		int n = 454;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			rev = (rev * 10) + r;
			n = n / 10;
		}
		if (temp == rev)
			System.out.println("it is a palindrome number " + rev);
		else
			System.out.println("not palindrome");
	}
}
