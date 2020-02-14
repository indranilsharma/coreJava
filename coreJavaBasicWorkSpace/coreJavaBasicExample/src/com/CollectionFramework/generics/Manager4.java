package com.CollectionFramework.generics;

class D<Test> {
	Test i;

	void demo(Test i) {
		System.out.println("Demo(test)");
	}
}

public class Manager4 {
	public static void main(String[] args) {
		D<String> obj = new D<String>();
		obj.i = "india";
		D<Integer> obj1 = new D<Integer>();
		obj1.i = 50;
		System.out.println("done");
	}
}
