package com.array.programs;

import java.util.Arrays;

/*second highest element
 * str.length-2*/

//case 1) 10, 2, 30, 40, 15, 50, 3, 70
//case 2) 2,3,10,15,30,40,50,70
//case 3)second largest is array.length-2 element
public class SecondHighestElement {
	public static void main(String[] args) {
		int[] array = { 10, 2, 30, 40, 15, 50, 3, 70 };
		Arrays.sort(array);
		/*
		 * for (int i = 0; i < array.length; i++) { //System.out.println(array[i]);
		 * System.out.println(array[array.length - 2]); }
		 */
		System.out.println("the second highest element in the array is :" + array[array.length - 2]);
		System.out.println("the First highest element in the array is :" + array[array.length - 1]);
	}
}
