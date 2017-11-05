package com.lambda;

public class ClosureInLambda {
	public static void main(String[] args) {
		int b = 20;
		process(10, a -> System.out.println(a + b));
		// this a+b is a closure there as b value is not visible to process but
		// still java allowes it.b should be effectively final to do this
	}

	static void process(int a, Process p) {
		p.process(a);

	}

	interface Process {
		void process(int a);
	}

	abstract class Process2 {
		abstract void process(int a);
	}
}
