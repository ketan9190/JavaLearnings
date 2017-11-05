package com.polymorphism;

/*
 * at compile time everything will be statically binded
 * but at run time  overriden methods(instance methods) will be dynamically bounded
 */
public class Child extends Parent {

	static int staticVariable = 100;
	int instanceVariable = 500;

	public static void main(String[] args) {
		System.out.println(Child.staticVariable);
		// 100 as staticVariable is
		// also defined in subclass so subclass variable will be given priority
		System.out.println(Parent.staticVariable2);
		System.out.println(Child.staticVariable2);
		// staticVariable2 can be called from sub class name as well as from
		// super class also as it is inherited as static member is subclass

		Child c = new Child();
		System.out.println(c.instanceVariable);
		System.out.println(c.instanceVariable2);

		Parent p = new Child();
		p.parentMethod();
		// as of now at compile time it is statically bounded , compiler will
		// check whether parentMethod is available in Hello or not
		// it is at runtime when jvm decide to call the overriden method based
		// on object type
		// therefor below will give error

		// p.extraMethod();

		// at this time it is statically bounded so it will
		// give compile time error as extraMethod is not available for Paraent
		// type
		parentStaticMethod();

	}

	/**
	 * - this is instance method not private/final , hence it is considered as
	 * overridden - access modifiers can have more visibility, in parent it was
	 * default -return type can be same or subtype of return type mention in
	 * parent
	 * 
	 */
	public Integer parentMethod() {
		System.out.println("Child class : parentMethod");
		return 10;
	}

	/*
	 * - this is not overridden , it is hiding the method of parent class
	 */
	/*
	 * static void parentStaticMethod() { System.out.println(
	 * "child class : parentStaticMethod"); }
	 */

	void extraMethod() {

	}

	/*
	 * This static method cannot hide the instance method from Parent as
	 * parentFinalMethod is instance method
	 */
	/*
	 * static void parentFinalMethod() {
	 * 
	 * }
	 */

	/*
	 * Cannot override the final method from Parent
	 */
	/*
	 * void parentFinalMethod() { }
	 */

	void abc(float d, int b) {
	}
}
