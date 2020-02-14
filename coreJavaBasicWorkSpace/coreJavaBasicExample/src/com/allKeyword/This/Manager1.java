package com.allKeyword.This;

public class Manager1 {
	public Manager1() {

		System.out.println("Manager1()");

	}

	public Manager1(int i) {
		this();
		System.out.println("Manager1(int i)");
	}

	public Manager1(int i, int j) {
		System.out.println("Manager1(int i, int j)");
	}

	public static void main(String[] args) {
		Manager1 obj = new Manager1();
		System.out.println("default constractor");
		Manager1 obj1 = new Manager1(10);
		System.out.println("one parameterised constactor");
		Manager1 obj2 = new Manager1(10, 10);
		System.out.println("2 parametersid");

	}
}
