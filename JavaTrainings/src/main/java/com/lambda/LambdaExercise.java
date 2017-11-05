package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class LambdaExercise {

	public static void main(String[] args) {

		List<Person> p = Arrays.asList(new Person("Ketan", "Gupta", 27), new Person("Anu", "Gupta", 27),
				new Person("Prince", "Mittal", 26), new Person("Naveen", "Jain", 28));
		TreeSet<Person> tree = new TreeSet<>((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		tree.addAll(p);

		System.out.println(tree);
		printWithCondition(tree, x -> x.getLastName().startsWith("G"));
	}

	static void printWithCondition(Set<Person> s, Predicate<Person> p) {
		for (Person pe : s) {
			if (p.test(pe)) {
				System.out.println(pe);
			}
		}
	}
}
