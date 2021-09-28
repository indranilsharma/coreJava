package com.allKeyword.abstrac.method_class;

abstract class Set1 {

	void test1() {
		System.out.println("test1()");
	}
}

// empty abs class
abstract class Set2 {
}

abstract class Set3 extends Set1 {
}

abstract class Set4 extends Set3 {
}

public class Manager22 {
	public static void main(String[] args) {
		System.out.println("........");

		//abstract empty implementation
		Set3 set3 = new Set3(){
		};
		set3.test1();
		System.out.println("........");
		
		//abstract empty implementation
		Set4 set4 = new Set4() {
		};
		System.out.println(".......");
	}
}
