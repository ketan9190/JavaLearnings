package com.abstraction.interface1;

interface I3 {
	default void m1() {
		System.out.println("m1:in interface I2");
	}

	default void m2() {
		System.out.println("m2:in interface I2");
	}

	void m3();
}

abstract class C {
	/**
	 * abstract method conflicts with default m1 in Example so must be be
	 * overriden
	 */
	abstract void m1();

	/**
	 * this instance method will be given preference over default methods or
	 * override the default methods. and no need to override m2 method in
	 * Example3 even if it conflicts with I3.m2()
	 */
	public void m2() {
		System.out.println("m2:in abstract class");
	}

	/*
	 * instance method will override abstract method in interface
	 */
	public void m3() {
		System.out.println("m3:in abstract class");
	}
}

public class Example3 extends C implements I3 {

	@Override
	public void m1() {
		System.out.println("in class Example3 : m1");

	}

	public static void main(String[] args) {
		Example3 e = new Example3();
		e.m1();
		e.m2();
		e.m3();
	}
}
