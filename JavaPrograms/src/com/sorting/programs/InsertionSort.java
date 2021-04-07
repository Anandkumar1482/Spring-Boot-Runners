package com.sorting.programs;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = { 30, 10, 40, 20, 50 };

		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j;
			for (j = i - 1; j > 0 && temp < a[j - 1]; j++) {
				a[j] = a[j - 1];

			}
			a[j] = temp;
		}
		System.out.println("the sorting order is ");
	}
}
