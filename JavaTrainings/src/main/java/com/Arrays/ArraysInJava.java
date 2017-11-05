package com.Arrays;

public class ArraysInJava {
	static final int[] a;

	static {
		a = new int[] { 1, 2, 3 };
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, }, { 3, 4 } };

		int[] b = a[1];
	}
}