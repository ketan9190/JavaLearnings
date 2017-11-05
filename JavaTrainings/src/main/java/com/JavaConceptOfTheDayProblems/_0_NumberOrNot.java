package com.JavaConceptOfTheDayProblems;

public class _0_NumberOrNot {
	public static void main(String[] args) {
		String ip = "1234a";
		if (numberOrNot(ip))
			System.out.println(ip + " is a number");
		else
			System.out.println(ip + " is not a number");
	}

	private static boolean numberOrNot(String ip) {
		try {
			Integer.parseInt(ip);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;

	}
}
