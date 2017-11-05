package com.Arrays;

import java.util.Arrays;

import com.sampleObjects.Student;

public class ArraysSort {
	public static void main(String[] args) {

		Student[] s = new Student[] { new Student("Ketan", 27), new Student("Aahul", 26) };
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
	}
}
