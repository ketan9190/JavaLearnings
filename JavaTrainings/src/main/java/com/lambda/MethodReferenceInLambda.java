package com.lambda;

public class MethodReferenceInLambda {

	public static void main(String[] args) {

		Interf1 i = (p, q) -> m1(p, q);
		showHere(i);

		Interf1 i2 = MethodReferenceInLambda::m1;
		showHere(i2);
		// as we can notive in i lambda we are just calling another method m1
		// without doing any stuff on this thats like we are bypassing it to m1
		// . in this case we can replace with classname where that method m1 is
		// defined :: method name
	}

	static void m1(String s1, String s2) {
		System.out.println(s1 + s2);
	}

	static void showHere(Interf1 i) {
		i.show("hi", "Java");
	}
}

interface Interf1 {
	void show(String s1, String s2);
}
