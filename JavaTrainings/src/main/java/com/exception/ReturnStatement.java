package com.exception;

public class ReturnStatement {
	public static void main(String[] args) {
		System.out.println(m1());
	}

	static String m1() {
		String s = null;
		try {
			s = "try";
			return s;
		} catch (Exception e) {
			s = s + "catch";
			return s;
		} finally {
			s = s + "finally";
			System.out.println(s);
		}
		// return s;
	}
}
