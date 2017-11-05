package com.practice;

/**
 * abba - null abbaedccd- aaedccd - edccd-edd-e remove the consicutive
 * characters if they are same in one iteration and do until all consecutive
 * have been removed.
 * 
 * @author ketan
 */
public class RemovecharactersOccuringInGroupFromString {

	public static void main(String[] args) {
		System.out.println(removeConsecutiveLetter("abbacddcffe"));
	}

	static String removeConsecutiveLetter(String s) {
		String ip = s;
		boolean flag = false;
		for (int i = 0; i < s.length() - 1; i++) {

			if (ip.charAt(i) == ip.charAt(i + 1)) {
				ip = ip.substring(0, i) + ip.substring(i + 2);
				System.out.println(ip);
				flag = true;
				break;
			}
		}
		if (ip.isEmpty())
			return "Empty";
		if (flag)
			return removeConsecutiveLetter(ip);
		else
			return ip;

	}
}
