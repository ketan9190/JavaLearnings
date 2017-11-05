package com.abstraction.interface1;

interface I6 {
	default void m1() {
		System.out.println("m1:in interface I6");
	}

}

/*
 * class C2 {
 * 
 * instance method will override default methods(from I4 and I5)in Example4
 * 
 * public void m1() { System.out.println("m1:in class C2"); }
 * 
 * 
 * instance method will override abstract method(from I5)in Example4
 * 
 * public void m2() { System.out.println("m2:in class C2"); } }
 */

public class Example5 implements I6 {

	static void m1(int i) {

	}

	public static void main(String[] args) {
		Example4 e = new Example4();
		e.m1();
		e.m2();
	}
}
