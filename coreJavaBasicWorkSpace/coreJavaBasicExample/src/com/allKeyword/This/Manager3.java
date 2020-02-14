package com.allKeyword.This;

public class Manager3 {

	public Manager3() {

		System.out.println("Manager3()");

	}

	public Manager3(int i) {
		// Manager3();
		System.out.println("Manager2(int i)");
	}

	public static void main(String[] args) {
		Manager3 obj = new Manager3();
		System.out.println("default constractor");
		Manager3 obj2 = new Manager3(10);
		System.out.println("one parameterised constactor");

	}
}
