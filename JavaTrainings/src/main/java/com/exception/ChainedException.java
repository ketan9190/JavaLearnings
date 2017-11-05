package com.exception;

import java.io.IOException;

public class ChainedException {
	public static void main(String[] args) {
		try {
			new A().m1();
		} catch (IOException e) {
			System.out.println(e.getCause()); // this will print the actual
												// cause i.e
												// NumberFormatException
			e.printStackTrace();
		}

	}
}

class A {

	void m1() throws IOException {
		try {
			throw new NumberFormatException("this is actual cause");
		} catch (NumberFormatException e) {
			throw new IOException("hi", e); // actual exception thrown is
											// NumberFormatException
		}
	}
}