package com.practice;

import java.util.HashSet;
import java.util.Set;

public class Panagram {
	public static void main(String[] args) {
		System.out.println(isPanagram2("The quick brown fox jumps over the lazy dog"));
	}

	static boolean isPanagram(String s) {
		if (s.length() < 26)
			return false;

		for (char i = 'A'; i <= 'Z'; i++) {
			if (s.indexOf(i) < 0 && s.indexOf(i + 32) < 0) {
				return false;
			}
		}

		return true;

	}

	static boolean isPanagram2(String s) {
		Set<Character> set = new HashSet<>();
		for (Character c : s.toCharArray()) {
			set.add(c);
		}

		if (set.size() < 26)
			return false;
		else
			return true;
	}
}
