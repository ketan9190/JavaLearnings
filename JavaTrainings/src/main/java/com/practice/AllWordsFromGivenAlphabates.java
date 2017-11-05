package com.practice;

public class AllWordsFromGivenAlphabates {

	public static void main(String[] args) {
		words(new char[] { 'a', 'b' }, 3);

	}

	static void words(char[] chArr, int k) {
		allWords(chArr, chArr.length, k, "");
	}

	private static void allWords(char[] chArr, int length, int k, String prefix) {

		if (k == 0) {
			System.out.println(prefix);
			return;
		}
		for (int i = 0; i < length; i++) {
			// prefix = prefix + chArr[i];
			allWords(chArr, length, k - 1, prefix + chArr[i]);
		}

	}

}
