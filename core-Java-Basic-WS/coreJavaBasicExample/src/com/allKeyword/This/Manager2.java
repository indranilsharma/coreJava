package com.allKeyword.This;

public class Manager2 {
	public Manager2() {

		// this(10);  //RECUSIVE CALL
		System.out.println("Manager2()");

	}

	public Manager2(int i) {
		// this();
		System.out.println("Manager2(int i)");
	}

	public static void main(String[] args) {
		Manager2 obj = new Manager2();
		System.out.println("default constractor");
		Manager2 obj2 = new Manager2(10);
		System.out.println("one parameterised constactor");

	}
}
