package com.classesMethodsVariable.Variable.staticVariable;

class Manager3 {
	static int i;

	public static void main(String[] args) {
		System.out.println("from main " + i);
		System.out.println("from main " + Manager3.i);
	}
}
