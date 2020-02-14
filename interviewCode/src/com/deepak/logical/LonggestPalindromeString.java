package com.deepak.logical;

public class LonggestPalindromeString {

	public static String palindrome(String str) {
		int leftIndex = 0, rightIndex = 0;
		String currentPalindrome = "", longgestPalindrome = "";
		for (int centreIndex = 1; centreIndex < str.length() - 1; centreIndex++) {
			leftIndex = centreIndex - 1;
			System.out.println("leftIndex... "+leftIndex);
			rightIndex = centreIndex + 1;
			System.out.println("rightIndex... "+rightIndex);
			while (leftIndex >= 0 && rightIndex < str.length()) {
				if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
					break;
				}
				currentPalindrome = str.substring(leftIndex, rightIndex + 1);
				System.out.println("leftIndex "+leftIndex);
				System.out.println("rightIndex + 1 "+rightIndex + 1);
				longgestPalindrome = currentPalindrome.length() > longgestPalindrome.length() 
						                ? currentPalindrome : longgestPalindrome;
				--leftIndex;
				System.out.println("--leftIndex===>"+ --leftIndex);
				++rightIndex;
				System.out.println("++rightIndex===>"+ ++rightIndex);
			}
		}
		return longgestPalindrome;
	}

	public static void main(String[] args) {
		String str = "GABCDCBAT45678987654Z";
		String longestPali = palindrome(str);
		System.out.println("String: " + str);
		System.out.println("Longest Palindrome: " + longestPali);
	}
}
