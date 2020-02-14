package com.allKeyword.Super;

public class Manager4 {
	Manager4(int i) {
		System.out.println("Manager4(int i)");
	}

	Manager4() {
		System.out.println("Manager4()");
	}
}

class Manager5 extends Manager4 {
	Manager5() {
		super(10);
		System.out.println("Manager5()");
	}

	Manager5(int i) {
		super();
		System.out.println("Manager5(int)");
	}

	public static void main(String[] args) {
		Manager5 obj = new Manager5();
		System.out.println(".......");
		Manager5 obj1 = new Manager5(10);
		Manager4 obj2 = new Manager4(100);
		System.out.println("..........");
		Manager4 obj3 = new Manager4();
		System.out.println(".........");

	}
}