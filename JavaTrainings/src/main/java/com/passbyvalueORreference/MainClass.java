package com.passbyvalueORreference;

public class MainClass {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.i = 100;
		abc(s);
		System.out.println(s.i);
	}

	static void abc(Sample s) {
		Sample s2 = s;
		s2.i = 10;
	}
}
