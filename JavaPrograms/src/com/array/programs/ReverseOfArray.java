package com.array.programs;

public class ReverseOfArray {
	public static void main(String[] args) {
		int[] array = { 10, 30, 50, 20, 60, 5 };
		int low = 0, high = array.length - 1;
		int temp;
		while (low < high) {
			temp = array[low];
			array[low] = array[high];
			array[high] = temp;
			low++;
			high--;
		}
		for (int i : array) {
			System.out.println("array " + i);
		}

	}
}
