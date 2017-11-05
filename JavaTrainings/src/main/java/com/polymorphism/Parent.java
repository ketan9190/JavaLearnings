package com.polymorphism;

public class Parent {
	static int staticVariable = 10;
	static int staticVariable2 = 20;

	int instanceVariable = 50;
	int instanceVariable2 = 60;

	static void parentStaticMethod() {
		System.out.println("parent class : parentStaticMethod");
	}

	Number parentMethod() {
		System.out.println("parent class : parentMethod");
		return 10;
	}

	final void parentFinalMethod() {
		System.out.println("parent class : final method");
	}

	private void parentPrivateMethod() {

	}

	void abc(int a, float b) {
	}
}
