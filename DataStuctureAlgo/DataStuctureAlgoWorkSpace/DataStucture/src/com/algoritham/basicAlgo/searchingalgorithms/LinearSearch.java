package com.algoritham.basicAlgo.searchingalgorithms;

//need to search next element of the array and time complexity is O(n) because only one loop require.

public class LinearSearch {

	public void linearSearch(int array[], int x) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				System.out.println("match found at location:"+array[i] + " size of the array :" + array.length);
			}

		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 8, 9, 5 };
		int x = 5;
		new LinearSearch().linearSearch(array, x);
	}
}
