package com.polymorphism;

class A {

}

class B extends A {

}

class C extends B {

}

public class Overloading1 {

	static void overloadedMethod(A a) {
		System.out.println("ONE");
	}

	static void overloadedMethod(B b) {
		System.out.println("TWO");
	}

	static void overloadedMethod(Object obj) {
		System.out.println("THREE");
	}

	public static void main(String[] args) {
		C c = new C();

		overloadedMethod(c);
		// it will try to find the method with parameter of exact type as passed
		// as argument , if not found then immediate super class of argument
		// will be searched then next immediate superclass and so on
	}

}
