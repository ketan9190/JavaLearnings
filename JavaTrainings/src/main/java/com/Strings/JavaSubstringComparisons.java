package com.Strings;

import java.util.TreeSet;

/*
 * We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows: 
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Input Format

The first line contains a string denoting . 
The second line contains an integer denoting .

Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Output Format

Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
 */
public class JavaSubstringComparisons {

	public static void main(String[] args) {
		smallestAndLargest("welcometojava", 3);

	}

	private static void smallestAndLargest(String string, int k) {
		TreeSet<String> sorted = new TreeSet<>();
		int i = 0;
		while (i + k <= string.length()) {
			sorted.add(string.substring(i, i + k));
			i++;
		}

		System.out.println(sorted.first() + " " + sorted.last());
	}

}
