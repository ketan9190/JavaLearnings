package com.wrapperClasses;

public class MIan {
	public static void methodOne(Object i) {
		System.out.println("Autoboxing");
	}

	public static void methodOne(Number i) {
		System.out.println("var-arg method");
	}

	public static void main(String[] args) {
		int x = 10;
		methodOne(x);
	}
}
