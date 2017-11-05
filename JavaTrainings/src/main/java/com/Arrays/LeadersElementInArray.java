package com.Arrays;

import java.util.Arrays;

/*
 * An element is said to be leader if all the elements on it’s right side are smaller than it.
 *  Rightmost element is always a leader. For example, if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3}
 *   are the leaders in this array.
 */
public class LeadersElementInArray {

	static void findTheLeaders(int[] input) {
		System.out.println("leader in " + Arrays.toString(input) + " are : ");
		int leader;
		boolean isLeader;
		for (int i = 0; i < input.length; i++) {
			leader = input[i];
			isLeader = true;
			for (int j = i + 1; j < input.length; j++) {
				if (leader < input[j]) {
					isLeader = false;
				}
			}
			if (isLeader)
				System.out.println(leader + " ");
		}
	}

	public static void main(String[] args) {
		findTheLeaders(new int[] { 12, 9, 7, 14, 8, 6, 3 });

		findTheLeaders(new int[] { 8, 23, 19, 21, 15, 6, 11 });

		findTheLeaders(new int[] { 55, 67, 71, 57, 51, 63, 38 });

		findTheLeaders(new int[] { 21, 58, 44, 14, 51, 36, 23 });
	}
}
