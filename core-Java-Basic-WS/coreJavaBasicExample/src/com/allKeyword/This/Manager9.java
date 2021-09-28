package com.allKeyword.This;

public class Manager9 {
	Manager9() {
		System.out.println("Manager9()");
	}

	{
		System.out.println("IIB-1");
	}

	Manager9(int i) {
		System.out.println("Manager9(int)");
	}

	Manager9(double d) {
		this();
		System.out.println("Manager9(double)");
	}

	public static void main(String[] args) {
		Manager9 obj = new Manager9();
		System.out.println(".......");
		Manager9 obj1 = new Manager9(100);
		System.out.println(".......");
		Manager9 obj2 = new Manager9(20.20);
	}
}
