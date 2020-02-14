package com.memoryCollection.GarbageCollection;

//How to Cause Leaks in a Garbage Collection System : Garbage Collection

public class Manager1 {
	static int[] storage = new int[] { 1, 2, 3 };
	static int index = 2;

	public static void main() {
		pop();
	}

	public static Object pop() {
		return storage[index--];
	}
}
