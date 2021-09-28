package com.memoryCollection.GarbageCollection;

//An Example of Garbage Collection in Action

public class Manager7 {
	public static void main(String[] args) {
		MyClass g;

		for (int i = 1; i < 15; ++i) {
			g = new MyClass(i);
		}
	}
}

class MyClass {
	String[] trash;
	int value;

	public MyClass(int n) {
		value = n;
		trash = new String[n];
		trash[0] = "This String uses up memory resources. ";
		for (int i = 1; i < n; ++i)
			trash[i] = trash[i - 1] + trash[i - 1];
	}

	protected void finalize() {
		System.out.println(value + " is being collected.");
	}
}