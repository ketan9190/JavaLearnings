package com.practice;

import java.util.Arrays;

public class Sort2dArrayWRT2ndColom {

	public static void main(String[] args) {
		int[][] i = { { 7, 5, 2, 8 }, { 2, 6, 5, 9 }, { 1, 1, 4, 2 }, { 0, 3, 5, 9 }, { 7, 0, 1, 2 } };
		System.out.println(i.length);
		// Arrays.sort(i);
		System.out.println(Arrays.deepToString(i));
		sort2(i);
	}

	static void sort2(int[][] i) {
		// https://stackoverflow.com/questions/4907683/sort-a-two-dimensional-array-based-on-one-column
		Arrays.sort(i, (i1, i2) -> Integer.valueOf(i1[1]).compareTo(Integer.valueOf(i2[1])));
		System.out.println(Arrays.deepToString(i));
	}

	static void sort(int[][] i) {
		int arrayLength = i.length;
		int[][] op = new int[arrayLength][];

		int[] sort = new int[arrayLength];

		for (int j = 0; j < arrayLength; j++) {
			sort[j] = i[j][1];
		}

		Arrays.sort(sort);
		for (int j = 0; j < arrayLength; j++) {
			for (int k = 0; k < arrayLength; k++) {
				if (sort[j] == i[k][1]) {
					op[j] = i[k];
				}

			}
		}

		System.out.println(Arrays.deepToString(op));
	}
}
