package com.Arrays;

public class ArrayClassMembers {
	public static void main(String[] args) {

		char[] charArray = new char[9];
		System.out.println("class for char array : " + charArray.getClass());

		byte[] byteArray = new byte[9];
		System.out.println("class for byte array : " + byteArray.getClass());

		short[] shortArray = new short[9];
		System.out.println("class for short array : " + shortArray.getClass());

		int[] intArray = new int[3];
		System.out.println("class for int array : " + intArray.getClass());

		long[] longArray = new long[6];
		System.out.println("class for long array : " + longArray.getClass());

		double[] doubleArray = new double[9];
		System.out.println("class for double array : " + doubleArray.getClass());
		int[][] int2DimArray = new int[3][];
		System.out.println("class for int 2d array : " + int2DimArray.getClass());

		Object[] objArray = new Object[2];
		System.out.println("class for Object array : " + objArray.getClass());

		Integer[] integerArray = new Integer[9];
		System.out.println(integerArray.getClass());
		System.out.println(intArray);
		Object o = intArray;
		/*
				int[] a = null;
				System.out.println(a[0]);
		*/ }
}
