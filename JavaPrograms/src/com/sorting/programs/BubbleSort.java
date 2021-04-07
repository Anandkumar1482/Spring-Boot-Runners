package com.sorting.programs;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 3, 8, 10, 6, 30, 79, 2 };
		System.out.println("before sorting");
		for (int each : array) {
			System.out.println(each);
		}
		System.out.println("after swapping");
		bubbleSort(array);
		for (int i : array) {
			System.out.println(i);
		}

	}

	private static void bubbleSort(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

	}
}
