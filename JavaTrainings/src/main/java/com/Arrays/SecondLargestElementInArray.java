package com.Arrays;

/*
 * wrong
 */
public class SecondLargestElementInArray {

	static int secondLargest(int[] input) {
		int largest = 0, secondLargest = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] > largest) {
				secondLargest = largest;
				largest = input[i];
			} else {
				secondLargest = input[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		System.out.println(secondLargest(new int[] { 45, 51, 28, 75, 74, 49, 42 }));

		System.out.println(secondLargest(new int[] { 985, 521, 975, 831, 479, 861 }));

		System.out.println(secondLargest(new int[] { 9459, 9575, 5692, 1305, 1942, 9012 }));

		System.out.println(secondLargest(new int[] { 47498, 14526, 74562, 42681, 75283, 45796 }));
	}
}
