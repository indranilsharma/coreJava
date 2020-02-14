package com.dataStucture.ElementaryDataStructures.array.SearchingSorting;

public class deleteElementLinerSearch {

	public static int findElement(int length, int array[], int key) {
		for (int i = 0; i < length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static int deleteElement(int length, int array[], int key) {
		int position = findElement(length, array, key);
		if (position == -1) {
			System.out.println("\nnot found");
			return length;
		} else {
			for (int i = position; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
		}
		return length -1;
	}

	public static void main(String[] args) {
		int[] array = { 12, 78, 88, 55, 12, 11, 4, 55, 88, 99, 8 };
		int key = 58;
		int length = array.length;
		System.out.println("Array before deletion");
		for (int i = 0; i < length; i++)
			System.out.print(array[i] + " ");
		length = deleteElement(length, array, key);
		System.out.println("\nArray after deletion");
		for (int i = 0; i < length; i++)
			System.out.print(array[i] + " ");

	}
}