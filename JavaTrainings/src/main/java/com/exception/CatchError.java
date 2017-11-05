package com.exception;

public class CatchError {

	public static void main(String... args) {
		try {
			Class.forName("Hi");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("not found");
		}
		try {
			m1();
		} catch (Throwable t) {
			System.out.println("hi");
		}
	}

	static void m1() {
		m1();
	}

}
