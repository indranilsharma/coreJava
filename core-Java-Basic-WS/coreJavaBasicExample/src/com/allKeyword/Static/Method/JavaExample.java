package com.allKeyword.Static.Method;

abstract class Base {
	Base() {
		System.out.println("Base Constructor Called");
	}

	abstract void fun();
}

class Derived extends Base {
	 //Derived() { System.out.println("Derived Constructor Called"); }
	void fun() {
		System.out.println("Derived fun() called");
	}
}

public class JavaExample {

	public static void main(String[] args) {
//		final int arr1[] = { 1, 2, 3, 4, 5 };
//		int arr2[] = { 10, 20, 30, 40, 50 };
//		arr2 = arr1;
//		// arr1 = arr2;
//		for (int i = 0; i < arr2.length; i++)
//			System.out.println(arr2[i]);
	
	Derived o = new Derived();
	//System.out.println();
	}

}
