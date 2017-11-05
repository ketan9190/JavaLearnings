package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveVowelsFromString {
	public static void main(String[] args) {
		removeVowels("My name is Varun Sharma");
		removeVowelsWithoutReplaceAll("My name is Varun Sharma");
	}

	static void removeVowels(String s) {
		System.out.println(s.replaceAll("[aeiouAEIOU]", ""));

	}

	static void removeVowelsWithoutReplaceAll(String s) {
		Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (!set.contains(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}
