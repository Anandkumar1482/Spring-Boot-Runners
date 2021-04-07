package com.string.programs;

import java.util.Scanner;

/*Java program to count total number of words in a string

This program will count total number of words in a string in Java. In this program we will read a string from the user and count total number of words in that.

The logic behind to implement this logic - Check two consecutive characters, if first character is space and next is not space, if the condition is true we will increase the counter.

Example

    Input:
    Enter string: Hello world

    Output:
    Total number of words in string are: 2*/
public class NUmberOfWordsInString {
	public static void main(String args[]) {
		String text;
		int countWords = 1;

		Scanner SC = new Scanner(System.in);

		System.out.print("Enter string: ");
		text = SC.nextLine();

		// word count
		for (int i = 0; i < text.length() - 1; i++) {
			if (text.charAt(i) == ' ' && text.charAt(i + 1) != ' ')
				countWords++;
		}

		System.out.println("Total number of words in string are: " + (countWords));
		// since last word does not contain and character after that

	}

}
