package com.statement.switchCase;

public class Manager3 {
	public static void main(String[] argv) {
		String s = "xyk";
		switch (s.length()) {  // return length int
		case 1:
			System.out.println("length is one");
			break;
		case 2:
			System.out.println("length is two");
			break;
		case 3:
			System.out.println("length is three");
			break;
		default:
			System.out.println("no match");
		}
	}
}