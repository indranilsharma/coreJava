package com.memoryCollection.GarbageCollection;

public class Manager2 {
	static Integer[] storage = new Integer[] { new Integer(1), new Integer(1) };
	static int index = 2;

	

	public static Object pop() {
		Object returnValue = storage[index];
		storage[index--] = null;
		return returnValue;
	}
	
	public static void main() {
		pop();
	}
}
