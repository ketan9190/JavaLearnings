package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Convert2dArrayTo1DInSortedOrder {

	public static void main(String[] args) {

		Integer[][] i = { { 4, 5, 12, 20 },

				{ 2, 6, 5, 90 },

				{ 1, 2, 4, 6 },

				{ 0, 3, 5, 9 } };
		System.out.println(i.length);
		sort2d(i);
	}

	static void sort2d(Integer[][] ip) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < ip.length; i++) {
			list.addAll(Arrays.asList(ip[i]));
		}

		TreeSet<Integer> set = new TreeSet<>(list);
		System.out.println(set);
	}
}
