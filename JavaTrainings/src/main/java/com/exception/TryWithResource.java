package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		// no use of this line, we need to mention resources in try itself like
		// below

		try (BufferedReader br1 = new BufferedReader(new FileReader("abc.txt"));
				BufferedReader br2 = new BufferedReader(new FileReader("abc.txt"))) {
			// we can define multiple resources like this
			// and note here there is no need of catch block or finally
		}

	}
}
