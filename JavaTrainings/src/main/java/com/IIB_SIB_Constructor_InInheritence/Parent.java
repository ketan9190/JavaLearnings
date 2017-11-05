package com.IIB_SIB_Constructor_InInheritence;

/*
 * It shows how IIB SIB and constructors are invoked in inheritance
 * 
 * Constructors, SIB – Static Initialization Block and IIB – Instance Initialization 
 * Block of super class will not be inheriting to its sub class.
 * But they are executed while creating an object to sub class. 
 * 
 * 
 * Ans 
 * // As per java specifications only class member get inherited, constructors
	// SIB and IIB are not class members In Java, a class body (the area between
	// braces) can contain the following key items: (1) Fields (2) Methods (3)
	// Other Classes (nested classes) (4) Constructors (5) Initializers Item
	// 1,2,3 define the state and behaviour of class object but 4,5 are for
	// initialization purpose only,therefore 4,5 are not considered as members
	// of a class.
 * 
 * 
 */
public class Parent {
	public Parent() {
		System.out.println("Parent constructor");
	}

	static {
		System.out.println("Parent SIB");
	}

	{
		System.out.println("Parent IIB");
	}
}
