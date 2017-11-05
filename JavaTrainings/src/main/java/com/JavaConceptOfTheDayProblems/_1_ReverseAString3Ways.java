package com.JavaConceptOfTheDayProblems;

public class _1_ReverseAString3Ways {
	public static void main(String[] args) {
		String s = "ILoveJava";
		usingReverseMethod(s);
		usingIterativeMethod(s);
		System.out.println(usingRecursion(s));
	}

	static void usingReverseMethod(String s) {
		System.out.println(new StringBuilder(s).reverse());
	}

	static void usingIterativeMethod(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}

	static String usingRecursion(String s) {
		if (s.length() == 0) {
			return s;
		}

		return usingRecursion(s.substring(1)) + s.charAt(0);
	}
}
