package com.allKeyword.Final.variable;

public class FinalArray {

	/*
	 * The array arr is declared as final, but the elements of array are changed
	 * without any problem. Arrays are objects and object variables are always
	 * references in Java. So, when we declare an object variable as final, it
	 * means that the variable cannot be changed to refer to anything else
	 */
	int j = 0;

	public static void main(String[] args) {

		final int arr[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
			System.out.println(arr[i]);
		}

		final FinalArray obj = new FinalArray();

		FinalArray obj1 = new FinalArray();

		/*
		 * we declare an object variable as final, it means that the variable
		 * cannot be changed to refer to anything else
		 */

		obj.j = 500;
		System.out.println("J :" + obj.j);
		// cannot assign a value to final variable
		// obj = obj1;
		System.out.println(obj.j);
		
	}

}
