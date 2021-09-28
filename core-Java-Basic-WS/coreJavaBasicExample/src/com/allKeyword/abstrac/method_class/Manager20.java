package com.allKeyword.abstrac.method_class;

abstract class Manager21 {
	//abstruct class with no abs method 
	void test1() {
		System.out.println("test1()");
	}
}

public class Manager20 extends Manager21 {
	public static void main(String[] args) {
		System.out.println(".....");
		Manager20 obj = new Manager20();
		obj.test1();
		System.out.println(".....");
	}
}
