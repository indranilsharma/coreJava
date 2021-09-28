package com.allKeyword.Final.variable;

public class TestArr {

	public static void main(String[] args) {
		final int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 10, 20, 30, 40, 50 };

		arr2 = arr1;

		/*
		 * So a final array means that the array variable which is actually a
		 * reference to an object, cannot be changed to refer to anything else,
		 */
		// arr1 = arr2;

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
