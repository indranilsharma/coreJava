package com.deepak.logical;

public class CheckStringIsPalindrome {
	private static boolean isPalindrome1(String str) {
		char[] chr = str.toCharArray();
		for (int i = 0; i < chr.length / 2; i++) {
			System.out.println("chr.length / 2   "+chr.length / 2);
			char c = chr[i];
			System.out.println("char c = chr[i];  "+c);
			chr[i] = chr[chr.length - 1 - i];
			System.out.println("chr[i];  "+chr[i]);
			chr[chr.length - 1 - i] = c;
			System.out.println("c; ====> "+c);
		}
		System.out.println("str  "+str);
		System.out.println("String.valueOf(chr)  "+String.valueOf(chr));
		return str.equals(String.valueOf(chr));

	}

	private static boolean isPalindrome2(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}

	public static void main(String[] args) {
		String s = "abcdcdaba";

		System.out.println("1st way Check String is palindrome by logic");

		if (isPalindrome1(s))

			System.out.println("Entered string is palindrome");

		else
			System.out.println("Entered string is not a palindrome");

		System.out.println("**************************************************");

		System.out.println("2nd way Check String is palindrome by predefine methods");
		if (isPalindrome2(s) == true)

			System.out.println("Entered string is palindrome");

		else
			System.out.println("Entered string is not a palindrome");

	}

}
