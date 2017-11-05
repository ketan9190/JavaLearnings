package com.regex;

import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\?"); // (or)[.]
		String[] s = p.split("www?dugrajobs?com");
		for (String s1 : s) {
			System.out.println(s1);// www
			// dugrajobs
			// com

			"111.111.111.111".matches(
					"(([0-1]*[0-9]{1,2})|([2][0-5]{2}))\\.(([0-1]*[0-9]{1,2})|([2][0-5]{2}))\\.(([0-1]*[0-9]{1,2})|([2][0-5]{2}))\\.(([0-1]*[0-9]{1,2})|([2][0-5]{2}))");
		}
	}
}
