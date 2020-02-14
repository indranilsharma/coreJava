package com.dataStucture.ElementaryDataStructures.array.rotation;

/*
Input arr[] = [1, 2, 3, 4, 5, 6, 7]
out put arr[] = [3, 4, 5, 6, 7, 1, 2]
we are going to follow rotate the are with the help of temp array who's size is 2
*/

public class RotateArray {
	public static void rotateArray(int array[], int tempSize, int arraySize) {

		
		for (int i = 0; i < tempSize; i++) {
			
			//System.out.println(array[i]);
			
			leftRotate(array , arraySize);
			//System.out.println(i+"hi");
		}
		//System.out.println("hi");
	}

	public static void leftRotate(int array[], int arraySize ) {

		//System.out.println(arraySize);
		int temp = array[0];
		int i;
		for (i = 0; i < arraySize - 1; i++) {
			//System.out.print(array[i]+" ");
			array[i] = array[i + 1];
			array[i] = temp;
			//System.out.print(i+" ");

		}
	}

	public static void printArray(int array[],int arraySize) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7 };
		int arraySize = array.length;
		//System.out.println(arraySize);
		int tempSize = 2;
		// printArray(array);
		rotateArray(array, tempSize, arraySize);
		//printArray(array);
	}
}
