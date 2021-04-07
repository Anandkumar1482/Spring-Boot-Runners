package com.number.programs;

/*a number that can be factored as 1 time itself is called prime number*/
public class PolindromNumber {
	public static void main(String[] args) {
		int remain, temp,rev = 0;
		int number = 121;
		temp = number;
		while (temp != 0) {
			remain = temp % 10;
			rev = (rev * 10) + remain;
			temp = temp / 10;

		}
		if (rev == temp)
			System.out.println("the number is plindrom ");
		else
			System.out.println("the number is not polindrom ");

	}
}
