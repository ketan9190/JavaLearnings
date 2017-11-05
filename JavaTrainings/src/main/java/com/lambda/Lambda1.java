package com.lambda;

public class Lambda1 {

	public static void main(String[] args) {
		// in lambda we can assign the functionality to variables.

		StringLength lambaVar = (String s) -> s.length();
		// i can remove String also as compiler will do Type inferece i.e by the
		// type of lamdaVar1 it will make sure
		// that getLength is the only method which can map to lambda expression
		// and it define the type of argument so we can skip that here and if
		// there is only 1 argument then we can skip the paramthesis as well
		StringLength lambaVar1 = s -> s.length();

		System.out.println(lambaVar1.getLength("java"));
	}

}

// functional interface - are specially ment for lambda exp - this interface
// must contain only one abstract method
interface StringLength {
	int getLength(String s);

}