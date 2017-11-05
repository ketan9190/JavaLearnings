package com.abstraction.interface1;

/*
 * java does not support multiple inheritance because if java allows extending multiple classes(say A and B)
 * and suppose class A and B both have method m1 defined in them 
 *so if class C extends A,B, now class C have ambiguity for method m1() , class C will not know which version on m1 should 
 *be executed.
 *
 *therefore java allows multiple inheritance via interfaces as interface just have abstract methods(until 1.7 version)
 *so even if there is same method m1(); declared in interface I and J and class C implements I,J  then anyhow class C have to 
 *implement m1 and that implemented method will be executed by class C
 *
 *now after 1.8v java allows default methods in interface which can have method definition as well in interface. 
 *these defaults methods are inherited to class which implements interface .now same
 *problem of ambiguity will arise as it was with classes. 
 *
 *so to resolve this java says:  if two or more independently defined default methods conflict, or a default method conflicts with an 
 *abstract method(either from interface or from abstract class), then the Java compiler produces a compiler error. You must explicitly override the supertype methods.
 *
 *if default method or abstract method conflict with instance method then instance method will be given preference. 
 *or we can say instance method will override conflicted default 
 *or abstract method
 * 
 *here we are taking example of conflict in 2 independent default methods 
 */

interface I1 {
	default void m1() {
		System.out.println("in interface I1");
	}
}

interface J1 {
	default void m1() {
		System.out.println("in interface J1");
	}
}

public class Example1 implements I1, J1 {

	public static void main(String... args) {
		Example1 e1 = new Example1();
		e1.m1();

	}

	/*
	 * we must explicitly override this as both I1 and J1 have this method so
	 * class C will be confused which one to use
	 */
	@Override
	public void m1() {
		// we can write our own implementation here and also invoke m1 version
		// of I1 and J1 like below
		I1.super.m1();
		J1.super.m1();
		System.out.println("in class");
	}
}