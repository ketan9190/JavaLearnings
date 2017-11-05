package com.Strings;

import java.lang.reflect.Field;

public class SCP {

	public static void main(String[] args) {

		String s1 = new String("you cannot change me!");
		String s2 = new String("you cannot change me!");
		// System.out.println(s1 == s2);// false
		String s3 = "you cannot change me!";
		// System.out.println(s1 == s3);// false
		String s4 = "you cannot change me!";
		// System.out.println(s3 == s4);// true
		String s5 = "you cannot " + "change me!";
		// System.out.println(s3 == s5);// true
		String s6 = "you cannot ";
		String s7 = s6 + "change me!";
		System.out.println(s3 == s7);// false
		final String s8 = "you cannot ";
		String s9 = s8 + "change me!";
		System.out.println(s3 == s9);// true
		System.out.println(s6 == s8);// true
		StringBuffer sb = new StringBuffer("abac");
		s9 = sb + s6;
		System.out.println(s9);
	}

	private int showInternalCharArrayHashCode(String s) {
		Field value;
		int hashcode = 0;
		try {
			value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			hashcode = value.get(s).hashCode();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hashcode;
	}
}
