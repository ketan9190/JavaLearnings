package com.Arrays;

import java.util.Arrays;

public class ArrayCopyOf {

	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 4 };
		int[] b = Arrays.copyOfRange(i, 1, 5);
		System.out.println(Arrays.toString(b));

		int[] c = new int[5];
		System.arraycopy(i, 0, c, 2, 3);
		System.out.println(Arrays.toString(c));

		String[][] s1 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };

		String[][] s2 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };

		Integer[][] ia = new Integer[2][];
		Object[] a = s1;

		// Number[] aa = ia;
		System.out.println(a + "  " + s1);
		System.out.println(Arrays.deepEquals(s1, s2)); // Output : true

		// Calling equals() method on same arrays will return false

		System.out.println(Arrays.equals(s1, s2)); // Output : false

		System.out.println();
		// That's why use deepEquals() method to compare multidimensional arrays
	}
}
