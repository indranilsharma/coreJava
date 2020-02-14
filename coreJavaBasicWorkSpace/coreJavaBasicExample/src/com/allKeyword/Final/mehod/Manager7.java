package com.allKeyword.Final.mehod;

//final method may not be overridden.

public class Manager7 {
	public static void main(String[] argv) {
		System.out.println();
	}
}

class MyClass2 {
	final void methodA() {
	}
}

class Subclass2 extends MyClass2 {
	/*
	 * void methodA() { // Error //Cannot override the final method from MyClass
	 * 
	 * }
	 */
}
