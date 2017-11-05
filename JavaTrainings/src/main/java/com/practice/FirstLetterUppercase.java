package com.practice;

public class FirstLetterUppercase {
	public static void main(String[] args) {
		firstUpper("i love java");
	}

	static void firstUpper(String ip) {

		String[] sArr = ip.split(" ");
		for (String s : sArr) {
			System.out.print(s.substring(0, 1).toUpperCase() + s.substring(1) + " ");
		}
	}

}
