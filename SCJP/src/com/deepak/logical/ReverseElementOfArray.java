package com.deepak.logical;

import java.util.Arrays;

public class ReverseElementOfArray {

	public static int[] reverseArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) //10
		{
			int temp = arr[i]; //temp-2 -3
			arr[i] = arr[arr.length - 1 - i];//59 89
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 5, 6, 7, 7, 8, 89, 59 };
		System.out.println(Arrays.toString(reverseArray(array)));
	}

}