package com.abstraction.interface1;

/*
 * if two or more independently defined default methods conflict, or a default method conflicts with an 
 *abstract method, then the Java compiler produces a compiler error. You must explicitly override the supertype methods.
 *
 *here default method conflicts with abstract method of interface, so here also we must override it
 */
interface I2 {
	default void m1() {
		System.out.println("in interface I2");
	}
}

interface J2 {
	void m1();
}

public class Example2 implements I2, J2 {

	@Override
	public void m1() {
		I2.super.m1();
		// J2.super.m1(); - this can not be used bcz m1 is abstract in J2
		System.out.println("in class Example2");
	}

	public static void main(String[] args) {
		Example2 e2 = new Example2();
		e2.m1();

		I2 i2 = new Example2();
		i2.m1();

		J2 j2 = new Example2();
		j2.m1();
	}

}
