package com.lambda;

import java.util.Arrays;
import java.util.List;

//stream is soemthing like a conveyer belt where we can put stuff and there are some workers who work on them
public class StreamUsingLambda {
	public static void main(String[] args) {

		List<Person> p = Arrays.asList(new Person("Ketan", "Gupta", 27), new Person("Anu", "Gupta", 27),
				new Person("Prince", "Mittal", 26), new Person("Naveen", "Jain", 28));
		System.out.println("using foreach");
		p.forEach(System.out::println);
		System.out.println("using streams");
		p.stream().filter(q -> q.getLastName().startsWith("G")).forEach(System.out::println);
	}
}