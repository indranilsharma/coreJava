package com.algoritham.basicAlgo.searchingalgorithms;

public class BinarySearch {

	public int binarySearchFollowRecursiveMethod(int array[], int elementTobeSearch, int l, int r) {

		if (r >= l) {

			int mid = l + (r - l) / 2;

			if (array[mid] == elementTobeSearch) {
				return mid;
			}

			if (array[mid] > elementTobeSearch) {
				return binarySearchFollowRecursiveMethod(array, elementTobeSearch, l, mid-1);
			}
          
			return binarySearchFollowRecursiveMethod(array, elementTobeSearch, mid+1 , r);
		}
		return -1;
	}

	public int binarySearchFollowMasterMethod(int array[], int elementTobeSearch) {

		int mid, l = 0, r = array.length;

		while (l <= r) {

			mid = l + (r - l) / 2;

			if (array[mid] == elementTobeSearch) {
				return mid;
			}
			if (array[mid] < elementTobeSearch){
				l=mid+1;
			}
			else 
				
			r=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 6, 8, 10, 15, 16, 17,22,66};//array should be shorted
														// manner
		int elementTobeSearch = 15;
		// int mid = array.length / 2;
		// int l = array[0];
		int r = array.length;
		System.out.println("length :"+r);
		
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]+" "+j+ " ");
		} 
		

		BinarySearch binarySearch = new BinarySearch();
		int resultRecursion = binarySearch.binarySearchFollowRecursiveMethod(array, elementTobeSearch, 0, r-1);
		
		if (resultRecursion == -1) {
			System.out.println("not present in search array :" + elementTobeSearch);
		} else {
			System.out.println(elementTobeSearch + " is present at location of :" + resultRecursion);
		}

		int resultMasterMethod = binarySearch.binarySearchFollowMasterMethod(array, elementTobeSearch);
		
		if (resultMasterMethod == -1) {
			System.out.println("not present in search array :" + elementTobeSearch);
		} else {
			System.out.println(elementTobeSearch + " is present at location of :" + resultMasterMethod);
		}
}
}
