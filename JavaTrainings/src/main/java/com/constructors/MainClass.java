package com.constructors;

class A {
	public A(int i) {
		System.out.println(1);
	}

	public A() {
		this(10); // constructor call
		A(10); // method call , constructor call can be made only via this or
				// super, not by constructor name, if we do call by name
				// compiler
				// will check method with that name
		System.out.println(2);
	}

	void A() {
		// this(10); constructor cannot be called from method , they can only
		// be called from constructor and too as the first statement only
		A(10);// method call
		System.out.println(3);
	}

	void A(int i) {
		System.out.println(4);
	}
}

public class MainClass {
	public static void main(String[] args) {
		new A().A(); // first constrctor A() is invoked to create the object
						// then on that object method A() is invoked
	}
}