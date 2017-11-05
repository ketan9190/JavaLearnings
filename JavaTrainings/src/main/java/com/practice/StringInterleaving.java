package com.practice;

public class StringInterleaving {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bcd";
		String s3 = "abcbdc";
		System.out.println(isInterleave(s1, s2, s3));
		System.out.println(is_Interleave(s1, 0, s2, 0, "", s3));
	}

	public static boolean is_Interleave(String s1, int i, String s2, int j, String res, String s3) {
		if (res.equals(s3) && i == s1.length() && j == s2.length())
			return true;
		boolean ans = false;
		if (i < s1.length())
			ans |= is_Interleave(s1, i + 1, s2, j, res + s1.charAt(i), s3);
		if (j < s2.length())
			ans |= is_Interleave(s1, i, s2, j + 1, res + s2.charAt(j), s3);
		return ans;

	}

	static boolean isInterleave(String s1, String s2, String s3) {
		int i = 0, j = 0, k = 0;
		char[] a, b, c;
		a = s1.toCharArray();
		b = s2.toCharArray();
		c = s3.toCharArray();

		while (k < s3.length()) {

			if (i < a.length && c[k] == a[i]) {
				i++;
			} else if (j < b.length && c[k] == b[j]) {
				j++;
			} else {
				return false;
			}
			k++;

		}
		return (i == a.length && j == b.length);

	}
}
