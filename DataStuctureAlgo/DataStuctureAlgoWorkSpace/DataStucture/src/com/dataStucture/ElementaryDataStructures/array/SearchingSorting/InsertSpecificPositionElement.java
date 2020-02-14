package com.dataStucture.ElementaryDataStructures.array.SearchingSorting;

public class InsertSpecificPositionElement {

	public static int insertElementRandomPosition(int length, int array[], int key, int value) {
		// int capacity = 20;
		if (key >= length) {
			return key;
		}
		array[key] = value;
		return (key + 1);
	}

	public static void main(String[] args) {
		int[] array = new int[20];
		array[0] = 12;
		array[1] = 78;
		array[2] = 88;
		array[3] = 55;
		array[4] = 48;
		array[5] = 99;
		int key = 6;
		int value = 100;

		int length = 20;

		System.out.println("before insert\n");	
		for (int i = 0; i < key; i++) {
			System.err.print(array[i] + " ");
		}

		key = insertElementRandomPosition(length, array, key, value);
		System.out.println("\nafter insert");
		for (int i = 0; i < key; i++) {
			System.err.print(array[i] + " ");
		}
	}
}
