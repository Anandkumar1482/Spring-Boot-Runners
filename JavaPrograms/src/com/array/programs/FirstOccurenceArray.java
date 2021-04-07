package com.array.programs;

public class FirstOccurenceArray {
	public static void main(String[] args) {
		// creating array
		int[] array = { 1, 2, 3, 4, 1, 6, 7, 8 };

		// first element of array
		for (int i = 0; i < array.length; i++) {

			// second element of array
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					// System.out.println(array[i]);
					System.out.println("the first occurence in the array value :" + +array[i]);
				}
			}

		}

	}
}
