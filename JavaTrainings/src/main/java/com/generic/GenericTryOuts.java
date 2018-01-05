package com.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTryOuts<T> {

	List<?> a;

	T x;

	public static void main(String[] args) {

		ArrayList<Number> l1 = new ArrayList<>();
		ArrayList<?>[] l = new ArrayList<?>[10];

		l[0] = new ArrayList<Number>();
		l[1] = new ArrayList<String>();

	}

	static void m1(ArrayList<? super Number> l) {

		System.out.println("hi");

	}

}

interface I1 {

}

interface I2 extends I1 {

}