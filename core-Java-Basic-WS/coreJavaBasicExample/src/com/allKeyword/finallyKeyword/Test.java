package com.allKeyword.finallyKeyword;

public class Test {

	public static void main(String[] args) {

		int i = 100;
		int k = 0;
		try {
			System.out.println("inside try");
			int j = i / 10;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("inside finally");
		}

		try {
			System.out.println("inside try-2");
			int j = i / 0;
			// catch exception
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("inside finally-2");
		}
		try {
			System.out.println("inside try");
			int j = i / 10;
		} // proper exception not matched
		catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("inside finally-3");
		}
	}
}
