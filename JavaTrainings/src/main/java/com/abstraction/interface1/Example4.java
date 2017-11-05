package com.abstraction.interface1;

interface I4 {
	default void m1() {
		System.out.println("m1:in interface I4");
	}
}

interface I5 {
	default void m1() {
		System.out.println("m1:in interface I5");
	}

	void m2();
}

class C2 {
	/*
	 * instance method will override default methods(from I4 and I5)in Example4
	 */
	public void m1() {
		System.out.println("m1:in class C2");
	}

	/*
	 * instance method will override abstract method(from I5)in Example4
	 */
	public void m2() {
		System.out.println("m2:in class C2");
	}
}

public class Example4 extends C2 implements I4, I5 {

	public static void main(String[] args) {
		Example4 e = new Example4();
		e.m1();
		e.m2();
	}
}
