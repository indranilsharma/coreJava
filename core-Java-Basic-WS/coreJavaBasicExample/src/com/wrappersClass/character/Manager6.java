package com.wrappersClass.character;

public class Manager6 {

	public static void main(String args[]) {
		char a[] = { 'a', '5', 'A', ' ' };
		System.out.print(Character.isDigit(a[0]) + " ");
		System.out.print(Character.isWhitespace(a[3]) + " ");
		System.out.print(Character.isUpperCase(a[2]));

	}
}