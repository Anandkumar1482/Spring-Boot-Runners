package com.array.programs;

public class LargestAndSmalletNumber {
	public static void main(String[] args) {
		int[] Array = new int[] { 10, 50, 90, 4, 60 };
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int number : Array) {
			if (number > largest)
				largest = number;
			else if (number < smallest)
				smallest = number;

		}
		System.out.println("the largest number is " + largest);
		System.out.println("the smallest number is " + smallest);
	}
}
